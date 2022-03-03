/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 */
package OperacionApp;

import java.util.Scanner;

public class RectanguloApp {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Rectangulo Re = new Rectangulo();

        System.out.println("Ingrese la base del Rectangulo");
        int Base = leer.nextInt();
        System.out.println("ingrese la altura del Rectangulo");
        int Altura = leer.nextInt();

        Re.CrarRectangulo(Altura, Base);

         

        System.out.println("La superficie del rectangulo es de: " + Re.getSuperficie());
        System.out.println("el perimetro del rectangulo es de: " + Re.getPerimetro());
    }

}
