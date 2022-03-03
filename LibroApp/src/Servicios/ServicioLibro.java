package Servicios;

import java.util.Scanner;
import libroapp.Libro;

public class ServicioLibro {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro CrearLibro() {
        System.out.println("Introducir Nombre");
        String Nombre = leer.next();
        System.out.println("introducir numero de paginas");
        int NumeroPag = leer.nextInt();

        return new Libro(Nombre, NumeroPag);
        
    }

}
