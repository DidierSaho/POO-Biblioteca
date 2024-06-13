import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombreBiblioteca;

    private List<Prestamo> prestamosGenerados = new ArrayList<>();
    private List<Libro> libros = new ArrayList<>();
    public void agregarLibro(Libro nuevoLibro) {
        libros.add(nuevoLibro);
    }
    public List<Libro> getLibros(){
        return libros;
    }
    public Prestamo nuevoPrestamo(Libro unLibro, Alumno alumno) {
         Prestamo prestamo = new Prestamo(unLibro, alumno);
         unLibro.setDisponiblidad(false);
         return prestamo;
    }

    public void devolverPrestamo(Prestamo miPrestamo){
        miPrestamo.getLibro().setDisponiblidad(true);

    }


}
