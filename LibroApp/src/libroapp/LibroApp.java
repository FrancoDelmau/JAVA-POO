/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package libroapp;

import Servicios.ServicioLibro;
import java.util.Scanner;

public class LibroApp {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ServicioLibro SL = new ServicioLibro();

        Libro L1 = SL.CrearLibro();

        System.out.println("ingrese el ISBN ");
        int ISBN = leer.nextInt();
        System.out.println("ingrese el titulo ");
        String Titulo = leer.next();
        System.out.println("ingrese el Autor ");
        String Autor = leer.next();
        System.out.println("ingrese el numero de paginas ");
        int NumerosPag = leer.nextInt();
        L1.llenarLibro(ISBN, Titulo, Autor, NumerosPag);
        System.out.println(L1.toString());
        
    }

}
