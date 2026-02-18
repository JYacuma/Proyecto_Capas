package org.example.View;

import org.example.Model.Libro;
import java.util.List;
import java.util.Scanner;

public class LibroView {

    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("============ BIBLIOTECA ===========");
        System.out.println("1. Registrar libro");
        System.out.println("2. Listar libros");
        System.out.println("3. Prestar libro");
        System.out.println("4. Devolver libro");
        System.out.println("5. Salir");
        System.out.println("=====================================");
    }

    public int leerOpcion() {
        return leerLong("Seleccione una opción: ");
    }

    public int leerLong(String mensaje) {
        System.out.print(mensaje);
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public void mostrarLibros(List<Libro> libros) {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }
        System.out.println("------------- LIBROS ----------------");
        for (Libro libro : libros) {
            System.out.println("ID: " + libro.getId());
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Estado: " + libro.getEstado());
            System.out.println("------------------------------------");
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarOpcionInvalida() {
        System.out.println("Opción inválida. Por favor intente de nuevo.");
    }
}