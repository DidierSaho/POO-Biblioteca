public class Libro {
    private String titulo;
    private String autor;

    private boolean disponible = true;

    public Libro(String titulo,String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public boolean estaDisponible() {
        return this.disponible;
    }

    public void setDisponiblidad(boolean estado){
        this.disponible = estado;

    }


}
