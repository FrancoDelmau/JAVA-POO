/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package circunferenciaapp;

import java.util.Scanner;

public class CircunferenciaApp {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Circunferencia Ci = new Circunferencia();

        System.out.println("Ingrese el radio");
        double Radio = leer.nextDouble();

        Ci.CrearCircunferencia(Radio);

        System.out.println("El area es: " + Ci.getArea() + " EL perimetro es de: " + Ci.getPerimetro());
    }

}
