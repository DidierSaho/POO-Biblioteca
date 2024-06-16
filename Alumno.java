package Tp;

public class Alumno {
    private String nombre;
    private int legajo;

    // constructor que recibe el nombre y el legajo como parámetros
    public Alumno(String nombre, int legajo) {
        this.nombre = nombre;  // asigna los parámetros a los atributos de la clase
        this.legajo = legajo;  // asigna los parámetros a los atributos de la clase
    }

    // metodo getter para obtener el nombre del alumno
    public String getNombre() {
        return nombre;
    }

    // método getter para obtener el legajo del alumno
    public int getLegajo() {
        return legajo;
    }
}
