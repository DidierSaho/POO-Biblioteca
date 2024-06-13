import java.util.ArrayList;
import java.util.List;
//crear posible exepciones de negocio en la parte de reservas inexistentes. metodo(blalba) Throws miExepcion . tenemos que crear una clase con la expecion y realizar la logica afuera pero el mensaje adentro de la clase.

public class Prestamo {
        private Libro libro;
        private Alumno alumno;
        public Prestamo(Libro unLibro, Alumno alumno) {
            unLibro.setDisponiblidad(false);
    }

    public Libro getLibro() {
        return libro;
    }

}
