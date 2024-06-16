package Tp;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // creacion de libros y la biblioteca
    	Libro principito = new Libro("El principito", "Antoine de Saint-Exupery");
        Libro harryPotter = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling");
        Libro bridgerton1 = new Libro("El duque y yo", "Julia Quinn");
        Libro bridgerton2 = new Libro("El vizconde que me amó", "Julia Quinn");
        Libro bryanTracy1 = new Libro("Goals!", "Brian Tracy");
        Libro bryanTracy2 = new Libro("Eat That Frog!", "Brian Tracy");
        Biblioteca uade = new Biblioteca("Biblioteca UADE");

        // muestra el nombre de la biblioteca
        System.out.println("Bienvenido a la biblioteca: " + uade.getNombreBiblioteca());
        System.out.println();

        // agregar los libros a la biblioteca
        uade.agregarLibro(principito);
        uade.agregarLibro(harryPotter);
        uade.agregarLibro(bridgerton1);
        uade.agregarLibro(bridgerton2);
        uade.agregarLibro(bryanTracy1);
        uade.agregarLibro(bryanTracy2);

        // crear alumnos
        Alumno didier = new Alumno("Didier", 11111);
        Alumno melany = new Alumno("Melany", 2222222);

        // obtener la lista de libros de la biblioteca
        List<Libro> libros = uade.getLibros();

        // verificar si hay libros disponibles
        if (libros.size() > 0) {
            try {
                // realizar un nuevo préstamo 
                Prestamo prestamoDidier = uade.nuevoPrestamo(libros.get(0), didier);
                System.out.println("Se ha realizado el préstamo para Didier:");
                System.out.println("Libro: " + prestamoDidier.getLibro().getTitulo());
                System.out.println("Autor: " + prestamoDidier.getLibro().getAutor());
                System.out.println("Alumno: " + prestamoDidier.getAlumno().getNombre());
                System.out.println("Legajo: " + prestamoDidier.getAlumno().getLegajo());
                System.out.println();

                // realizar un nuevo préstamo
                Prestamo prestamoMelany = uade.nuevoPrestamo(libros.get(1), melany);
                System.out.println("Se ha realizado el préstamo para Melany:");
                System.out.println("Libro: " + prestamoMelany.getLibro().getTitulo());
                System.out.println("Autor: " + prestamoMelany.getLibro().getAutor());
                System.out.println("Alumno: " + prestamoMelany.getAlumno().getNombre());
                System.out.println("Legajo: " + prestamoMelany.getAlumno().getLegajo());
                System.out.println();

                // devolver los libros prestados
                uade.devolverPrestamo(prestamoDidier);
                System.out.println("Se ha devuelto el préstamo de Didier:");
                System.out.println("Libro: " + prestamoDidier.getLibro().getTitulo());
                System.out.println("Autor: " + prestamoDidier.getLibro().getAutor());
                System.out.println("Alumno: " + prestamoDidier.getAlumno().getNombre());
                System.out.println("Legajo: " + prestamoDidier.getAlumno().getLegajo());
                System.out.println();


                // muestra los libros prestados
                List<Prestamo> prestamos = uade.getPrestamosGenerados();
                if (!prestamos.isEmpty()) {
                    System.out.println("Libros prestados:");
                    for (Prestamo prestamo : prestamos) {
                        System.out.println("- " + prestamo.getLibro().getTitulo() + " por " + prestamo.getAlumno().getNombre());
                    }
                    System.out.println();
                } else {
                    System.out.println("No hay libros prestados actualmente.");
                }

                // muestra los libros disponibles
                List<Libro> disponibles = uade.getLibrosDisponibles();
                if (!disponibles.isEmpty()) {
                    System.out.println("Libros disponibles:");
                    for (Libro libro : disponibles) {
                        System.out.println("- " + libro.getTitulo());
                    }
                } else {
                    System.out.println("No hay libros disponibles en este momento.");
                }
            } catch (Prestamo.MiExcepcion e) {
                System.out.println("Error al realizar el préstamo: " + e.getMessage());
            }
        } else {
            System.out.println("No hay libros disponibles para prestar.");
        }
    }
}

