package org.example.Model;

public class Libro {

    private Long id;
    private String Autor;
    private String Titulo;
    private EstadoLibro estado;

    public Libro() {
    }

    public Libro(Long id, String autor, String titulo) {
        this.id = id;
        this.Autor = autor;
        this.Titulo = titulo;
        this.estado = EstadoLibro.DISPONIBLE; // estado por defecto
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public EstadoLibro getEstado() {
        return estado;
    }

    public void setEstado(EstadoLibro estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", Autor='" + Autor + '\'' +
                ", Titulo='" + Titulo + '\'' +
                ", estado=" + estado +
                '}';
    }

    public void establecerEstado(EstadoLibro estado) {
        this.estado = estado;
    }

    public boolean isDisponible() {
        return this.estado == EstadoLibro.DISPONIBLE;
    }



}
