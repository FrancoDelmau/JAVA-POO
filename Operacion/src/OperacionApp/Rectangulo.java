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

public class Rectangulo {

    private int Base;
    private int Altura;
    private int Superficie;
    private int Perimetro;

    public Rectangulo() {

    }

    public Rectangulo(int Base, int Altura) {
        this.Altura = Altura;
        this.Base = Base;
    }

    public int getBase() {
        return Base;
    }

    public void setBase(int Base) {
        this.Base = Base;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public void CrarRectangulo(int Altura, int Base) {
        Superficie = Base * Altura;
        Perimetro = (Base + Altura) * 2;

    }

    public void Superficie() {

    }

    public void Perimetro() {

    }

    public int getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(int Superficie) {
        this.Superficie = Superficie;
    }

    public int getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(int Perimetro) {
        this.Perimetro = Perimetro;
    }

    public void DibujarRe() {

    }

    @Override
    public String toString() {
        return "Rectangulo{" + "Base=" + Base + ", Altura=" + Altura + ", Superficie=" + Superficie + ", Perimetro=" + Perimetro + '}';
    }

}
