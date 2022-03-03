/*
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
 */
package Servicios;

import CalculoMat.Calculo;
import java.util.Scanner;

public class CalculoServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private double Num1;
    private double Num2;
    private double Potencia;
    private double Raiz;

    public Calculo CalculoServicio() {
        Num1 = Math.random() * 10;
        Num2 = Math.random() * 10;
return new Calculo();
    }

    public Calculo devolverMayor() {
        if (Num1 > Num2) {

            System.out.println(Num1 + " Es el mayor");

        } else {
            System.out.println(Num2 + " Es el mayor");

        }
        return new Calculo();
    }

    public Calculo calcularPotencia() {

        Math.round(Num1);
        Math.round(Num2);

        if (Num1 > Num2) {

            Potencia = Math.pow(Num1, Num2);

        } else {
            Potencia = Math.pow(Num2, Num1);

        }
        return new Calculo();

    }

    public Calculo calcularRaiz() {
        Math.abs(Num1);
        Math.abs(Num2);

        if (Num1 < Num2) {

            Raiz = Math.sqrt(Num1);

        } else {
            Raiz = Math.sqrt(Num2);
        }

        return new Calculo();
    }

}
