import java.util.List;

public class Main {
    public static void main(String[] args) {

        Libro principito = new Libro("El principito","Antonio");
        Biblioteca uade = new Biblioteca();
        uade.agregarLibro(principito);
        Alumno didier = new Alumno("Didier",11111);

        //
        List<Libro> libros = uade.getLibros();
        uade.nuevoPrestamo(libros.get(1),didier);


    }


}
