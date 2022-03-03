/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
 */
package CalculoMat;

public class Calculo {

    private double Num1;
    private double Num2;

    public Calculo() {
    }

    public Calculo(int Num1, int Num2) {
        this.Num1 = Num1;
        this.Num2 = Num2;
    }

    public double getNum1() {
        return  Num1;
    }

    public void setNum1(int Num1) {
        this.Num1 = Num1;
    }

    public double getNum2() {
        return Num2;
    }

    public void setNum2(int Num2) {
        this.Num2 = Num2;
    }


    @Override
    public String toString() {
        return "Calculo{" + "Num1=" + Num1 + ", Num2=" + Num2 + '}';
    }

}
