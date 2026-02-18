package org.example.Service;

import org.example.Model.EstadoLibro;
import org.example.Model.Libro;
import java.util.ArrayList;
import java.util.List;

public class LibroServiceImpl implements LibroService {

    private List<Libro> libros = new ArrayList<>();

    @Override
    public void registrarLibro(long id, String titulo, String autor) {
        Libro libro = new Libro(id, titulo, autor);
        libros.add(libro);
    }

    @Override
    public List<Libro> listarLibros() {
        return libros;
    }

    @Override
    public boolean prestarLibro(long id) {
        Libro libro = buscarLibroPorId(id);
        if (libro != null && libro.isDisponible()) {
            libro.setEstado(EstadoLibro.PRESTADO);
            return true;
        }
        return false;
    }

    @Override
    public boolean devolverLibro(long id) {
        Libro libro = buscarLibroPorId(id);
        if (libro != null && !libro.isDisponible()) {
            libro.setEstado(EstadoLibro.DISPONIBLE);
            return true;
        }
        return false;
    }

    @Override
    public Libro buscarLibroPorId(long id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }
}
