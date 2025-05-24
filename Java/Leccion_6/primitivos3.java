package Java.Leccion_6;

import java.util.Scanner;

public class primitivos3 {
    public static void main(String[] args) {
        boolean varBool = false;
        System.out.println("Variable booleana: " + varBool);

        if (varBool){
            System.out.println("Variable verdadera.");
        }
        else {
            System.out.println("Variable falsa.");
        }

        var edad = 15;
        var adulto = edad >= 18;
        if (adulto){
            System.out.println("La persona es mayor de edad.");
        }
        else {
            System.out.println("La persona no es mayor de edad.");
        }

        //Conversión de tipos primitivos
        var edad2 = Integer.parseInt("29");
        System.out.println(edad2 + 1);

        var valorPi = Double.parseDouble("3.1416");
        System.out.println(valorPi);

        // //Petición de valor
        var entrada = new Scanner(System.in);
        System.out.println("Escriba su edad: ");
        var edadt = Integer.parseInt(entrada.nextLine());
        System.out.println("edad: " + edadt);

        //Conversión de tipos primitivos Parte 2
        var edadTexto = String.valueOf(10);
        System.out.println(edadTexto);

        var fraseChar = "Soy desarrolladora".charAt(0);
        System.out.println(fraseChar);
        
        System.out.println("Escriba un caracter: ");
        var charFrase = entrada.nextLine().charAt(0);
        System.out.println(charFrase);

    }   
}
