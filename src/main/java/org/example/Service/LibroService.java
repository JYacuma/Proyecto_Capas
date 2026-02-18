package org.example.Service;

import org.example.Model.Libro;
import java.util.List;

public interface LibroService {

    void registrarLibro(long id, String titulo, String autor);

    List<Libro> listarLibros();

    boolean prestarLibro(long id);

    boolean devolverLibro(long id);

    Libro buscarLibroPorId(long id);
}