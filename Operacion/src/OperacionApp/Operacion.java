package OperacionApp;

public class Operacion {

    private int Numero1;
    private int Numero2;
    private int Sumar;
    private int Restar;
    private int Multiplicar;
    private int Dividir;

    public Operacion() {

    }

    public Operacion(int Numero1, int Numero2) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
    }

    public int getNumero1() {
        return Numero1;
    }

    public void setNumero1(int Numero1) {
        this.Numero1 = Numero1;
    }

    public int getNumero2() {
        return Numero2;
    }

    public void setNumero2(int Numero2) {
        this.Numero2 = Numero2;
    }

    public void CrearOperacion(int Numero1, int Numero2) {
        Sumar = Numero1 + Numero2;
        Restar = Numero1 - Numero2;
        if (Numero2 == 0) {
            System.out.println("0");
            System.out.println("hubo un error en la multiplicacion");

        } else {
            Multiplicar = Numero1 * Numero2;

        }
        if (Numero2 == 0) {
            System.out.println("0");
            System.out.println("Hubo un error en la Division");
        } else {
            Dividir = Numero1 / Numero2;
        }
    }

    public int getSumar() {
        return Sumar;
    }

    public void setSumar(int Sumar) {
        this.Sumar = Sumar;
    }

    public int getRestar() {
        return Restar;
    }

    public void setRestar(int Restar) {
        this.Restar = Restar;
    }

    public int getMultiplicar() {
        return Multiplicar;
    }

    public void setMultiplicar(int Multiplicar) {
        this.Multiplicar = Multiplicar;
    }

    public int getDividir() {
        return Dividir;
    }

    public void setDividir(int Dividir) {
        this.Dividir = Dividir;
    }

    @Override
    public String toString() {
        return "Operacion{" + "Numero1=" + Numero1 + ", Numero2=" + Numero2 + ", Sumar=" + Sumar + ", Restar=" + Restar + ", Multiplicar=" + Multiplicar + ", Dividir=" + Dividir + '}';
    }

}
