package Tp;

public class Prestamo {
    private Libro libro;
    private Alumno alumno;

    // constructor que recibe un libro y un alumno como parámetros
    public Prestamo(Libro unLibro, Alumno unAlumno) throws MiExcepcion {
        if (unLibro == null || unAlumno == null) {  
            throw new MiExcepcion("El libro o el alumno no pueden ser nulos"); 
        }
        this.libro = unLibro; e
        this.alumno = unAlumno;

        unLibro.setDisponibilidad(false); 
    }

    // metodo getter para obtener el libro asociado al préstamo
    public Libro getLibro() {
        return libro;
    }

    // metodo getter para obtener el alumno asociado al préstamo
    public Alumno getAlumno() {
        return alumno;
    }

    
    public static class MiExcepcion extends Exception {
        public MiExcepcion(String mensaje) { 
            super(mensaje);
        }
    }
}
