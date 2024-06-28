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

   
    public String getTitulo() {
        return titulo;
    }

   
    public String getAutor() {
        return autor;
    }

    
    public boolean estaDisponible() {
        return disponible;
    }

   
    public void setDisponibilidad(boolean estado) {
        this.disponible = estado;
    }
}

