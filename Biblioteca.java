package Tp;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombreBiblioteca;
    
    // lista que almacena los prestamos 
    private List<Prestamo> prestamosGenerados = new ArrayList<>();
    
    // lista que almacena los libros disponibles en la biblioteca
    private List<Libro> libros = new ArrayList<>();
    
    // constructor para inicializar el nombre de la biblioteca
    public Biblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    // método para agregar un nuevo libro a la lista de libros de la biblioteca
    public void agregarLibro(Libro nuevoLibro) {
        libros.add(nuevoLibro);
    }
    
    // método para obtener la lista de libros de la biblioteca
    public List<Libro> getLibros() {
        return libros;
    }

    // método para obtener el nombre de la biblioteca
    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    // metodo para crear un nuevo préstamo
    public Prestamo nuevoPrestamo(Libro unLibro, Alumno alumno) throws Prestamo.MiExcepcion {
        Prestamo prestamo = new Prestamo(unLibro, alumno); 
        unLibro.setDisponibilidad(false); 
        prestamosGenerados.add(prestamo); 
        return prestamo;
    }

    // método para devolver un prestamo
    public void devolverPrestamo(Prestamo miPrestamo) {
        miPrestamo.getLibro().setDisponibilidad(true); 
        prestamosGenerados.remove(miPrestamo); 

    }

    
    public List<Prestamo> getPrestamosGenerados() {
        return prestamosGenerados;
    }
    
    // método para obtener la lista de libros disponibles
    public List<Libro> getLibrosDisponibles() {
        List<Libro> disponibles = new ArrayList<>();
        for (Libro libro : libros) { 
            if (libro.estaDisponible()) {
                disponibles.add(libro);
            }
        }
        return disponibles;
    }
}
