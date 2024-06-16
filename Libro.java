package Tp;

public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible = true;

    // constructor que inicializa el título y el autor del libro
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // metodo getter para obtener el título del libro
    public String getTitulo() {
        return titulo;
    }

    // método getter para obtener el autor del libro
    public String getAutor() {
        return autor;
    }

    // método para verificar si el libro esta disponible
    public boolean estaDisponible() {
        return disponible;
    }

    // método para establecer la disponibilidad del libro
    public void setDisponibilidad(boolean estado) {
        this.disponible = estado;
    }
}

