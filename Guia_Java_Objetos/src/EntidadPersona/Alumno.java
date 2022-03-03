/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package EntidadPersona;

import java.util.Scanner;

public class Alumno {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Persona P = new Persona();
        
        System.out.println("Ingrese el nombre");
        String Nombre = leer.next();
        
        System.out.println("Ingrese la Edad");
        int Edad = leer.nextInt();
        
        System.out.println("Ingrese el Sexo Siendo M para Masculino, F para Femenino y O para otros");
        String Sexo = leer.next() ; 
        
        System.out.println("Ingrese el peso ");
        int Peso = leer.nextInt();
       
        System.out.println("Ingrese su Altura");
       double Altura = leer.nextDouble();
       
       P.CrearPersona(Nombre, Sexo, Edad, Peso, Altura);
       
       
        System.out.println(Nombre + " " + Sexo + " " + Edad + " " + P.CalcularIMC(PesoIdeal));
        
        
    }
    
}
