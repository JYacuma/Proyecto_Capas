package org.example;

import org.example.Controller.LibroController;
import org.example.Model.Libro;
import org.example.Service.LibroService;
import org.example.Service.LibroServiceImpl;
import org.example.View.LibroView;

public class Main {
    public static void main(String[] args) {


        LibroService service = new LibroServiceImpl();
        LibroView view = new LibroView();
        LibroController controller = new LibroController(service, view);
        controller.ejecutar();


    }
}