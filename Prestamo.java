package Tp;

public class Prestamo {
    private Libro libro;
    private Alumno alumno;

    // constructor que recibe un libro y un alumno como parámetros
    public Prestamo(Libro unLibro, Alumno unAlumno) throws MiExcepcion {
        if (unLibro == null || unAlumno == null) {   // verifica si el libro o el alumno son nulos
            throw new MiExcepcion("El libro o el alumno no pueden ser nulos"); // excepción si el libro o el alumno son nulos
        }
        this.libro = unLibro; // asigna los parámetros a los atributos de la clase
        this.alumno = unAlumno; // asigna los parámetros a los atributos de la clase

        unLibro.setDisponibilidad(false); // marca el libro como no disponible
    }

    // metodo getter para obtener el libro asociado al préstamo
    public Libro getLibro() {
        return libro;
    }

    // metodo getter para obtener el alumno asociado al préstamo
    public Alumno getAlumno() {
        return alumno;
    }

    // clase estática que define una excepción 
    public static class MiExcepcion extends Exception {
        public MiExcepcion(String mensaje) { // constructor de la excepción 
            super(mensaje);
        }
    }
}
