package org.example.Controller;

import org.example.Model.Libro;
import org.example.Service.LibroService;
import org.example.View.LibroView;
import java.util.List;

public class LibroController {

    private final LibroService libroService;
    private final LibroView libroView;

    public LibroController(LibroService service, LibroView view) {
        this.libroService = service;
        this.libroView = view;
    }

    public void registrarLibro() {
        int id = libroView.leerLong("Ingrese el ID del libro: ");
        String titulo = libroView.leerTexto("Ingrese el título: ");
        String autor = libroView.leerTexto("Ingrese el autor: ");
        libroService.registrarLibro(id, titulo, autor);
        libroView.mostrarMensaje("Libro registrado exitosamente.");
    }

    public void listarLibros() {
        List<Libro> libros = libroService.listarLibros();
        libroView.mostrarLibros(libros);
    }

    public void prestarLibro() {
        long id = libroView.leerLong("Ingrese el ID del libro a prestar: ");
        boolean resultado = libroService.prestarLibro(id);
        if (resultado) {
            libroView.mostrarMensaje("Libro prestado exitosamente.");
        } else {
            libroView.mostrarMensaje("No se pudo prestar. Verifique el ID o el estado del libro.");
        }
    }

    public void devolverLibro() {
        int id = libroView.leerLong("Ingrese el ID del libro a devolver: ");
        boolean resultado = libroService.devolverLibro(id);
        if (resultado) {
            libroView.mostrarMensaje("Libro devuelto exitosamente.");
        } else {
            libroView.mostrarMensaje("No se pudo devolver. Verifique el ID o el estado del libro.");
        }
    }

    public void ejecutar() {
        int opcion;
        do {
            libroView.mostrarMenu();
            opcion = libroView.leerOpcion();
            switch (opcion) {
                case 1:
                    registrarLibro();
                    break;
                case 2:
                    listarLibros();
                    break;
                case 3:
                    prestarLibro();
                    break;
                case 4:
                    devolverLibro();
                    break;
                case 5:
                    libroView.mostrarMensaje("Cerrando programa....");
                    break;
                default:
                    libroView.mostrarOpcionInvalida();
            }
        } while (opcion != 5);
    }
}
