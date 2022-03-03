/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
 */
package EntidadPersona;

public class Persona {

    private String Nombre;
    private int Edad;
    private String Sexo;
    private double Peso;
    private double Altura;
  
    

    public Persona() {
    }

    public Persona(String Nombre, int Edad, String Sexo, double Peso, double Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public void CrearPersona(String Nombre, String Sexo, int Edad, double Peso, double Altura) {

        if ("M".equals(Sexo) || "F".equals(Sexo) || "O".equals(Sexo)) {
            System.out.println("correcto");
        } else {
            System.out.println("el valor ingresado es incorrecto");
        }
    }

    public int CalcularIMC(int Peso, int Altura) {
        int PesoIdeal = (Peso / Altura ^ 2);

        if (PesoIdeal < 20) {
            System.out.println("Esta por debajo de su peso ideal");
            return -1 ; 

        }
        if (PesoIdeal >= 20 & PesoIdeal <= 25) {
            System.out.println("Esta en su peso ideal");
            return 0 ; 

        }
        if (PesoIdeal > 25) {
        
            return 1 ; 
        }
        return PesoIdeal;
    }

    public Boolean MayordeEdad(int Edad) {

        return true == Edad >= 18;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Peso=" + Peso + ", Altura=" + Altura + '}';
    }

    
   
