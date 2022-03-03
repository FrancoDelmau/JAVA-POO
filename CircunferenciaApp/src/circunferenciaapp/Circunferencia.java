package circunferenciaapp;

public class Circunferencia {

    private double Radio;
    private double Area;
    private double Perimetro;

    public Circunferencia() {

    }

    public Circunferencia(double Radio, double Area, double Perimetro) {
        this.Radio = Radio;
        this.Area = Area;
        this.Perimetro = Perimetro;

    }

    public double getRadio() {
        return Radio;
    }

    public double setRadio() {
        return Radio;
    }

    public void CrearCircunferencia(double Radio) {
        Area = Math.PI * (Radio + Radio);

        Perimetro = 2 * Math.PI * Radio;

    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public double getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(double Perimetro) {
        this.Perimetro = Perimetro;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "Radio=" + Radio + ", Area=" + Area + ", Perimetro=" + Perimetro + '}';
    }

}
