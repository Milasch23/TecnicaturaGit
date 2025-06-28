package Leccion_10;

import java.util.Scanner;

public class ejerciciosClase10 {
    public static void main(String[] args) {

        //Ejercicio 10.2

        var numero = 4;
        var numeroTexto = "Número Desconocido";

        if(numero == 1) {
            numeroTexto = "Número Uno";
        }
        else if (numero == 2) {
            numeroTexto = "Número Dos";
        }
        else if (numero == 3) {
            numeroTexto = "Número Tres";
        }
        else if (numero == 4) {
            numeroTexto = "Número Cuatro";
        }
        else if (numero == 5) {
            numeroTexto = "Número Cinco";
        }
        else {
            numeroTexto = "No encontrado";
        }

        System.out.println("Valor Número: " + numeroTexto);


        //Ejercicio 10.3 - Estaciones del año
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el mes del año: ");
        var mes = Integer.parseInt(entrada.nextLine());

        if (mes == 1 || mes == 2 || mes == 3) {
            System.out.println("Verano");
        }
        else if (mes == 4 || mes == 5 || mes == 6) {
            System.out.println("Otoño");
        }
        else if (mes == 7 || mes == 8 || mes == 9) {
            System.out.println("Invierno");
        }
        else if (mes == 10 || mes == 11 || mes == 12) {
            System.out.println("Primavera");
        }
        else {
            System.out.println("Desconocido");
        }

        //Ejercicio 10.5 
        switch (numero) {
            case 1:
                numeroTexto = "Número Uno";
                break;
            case 2:
                numeroTexto = "Número Dos";
                break;
            case 3:
                numeroTexto = "Número Tres";
                break;
            case 4:
                numeroTexto = "Número Cuatro";
                break;
            default:
                numeroTexto = "No encontrado";
                break;
        }

        System.out.println(numeroTexto);

        //Ejercicio 10.5 - Estaciones del Año Version switch
        var estacion = "";
        switch (mes) {
            case 1: case 2: case 3:
                estacion = "Verano";
                break;
            case 4: case 5: case 6:
                estacion = "Otoño";
                break;
            case 7: case 8: case 9:
                estacion = "Invierno";
                break;
            case 10: case 11: case 12:
                estacion = "Primavera";
                break;
            default:
                estacion = "Estación no encontrada";
                break;
        }
        System.out.println(estacion);
        
        //Ejercicio 10.6 
        System.out.println("Ingrese una calificación (0 - 10)");
        var calificacion = Integer.parseInt(entrada.nextLine());
        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("A");
        }
        else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("B");
        }
        else if (calificacion >= 7 && calificacion <= 8) {
            System.out.println("C");
        }
        else if (calificacion >= 6 && calificacion <= 7) {
            System.out.println("D");
        }
        else if (calificacion >= 0 && calificacion <= 6) {
            System.out.println("F");
        }
        else {
            System.out.println("Fuera de rango");
        }

        //Ejercicio 10.6 versión Switch
        var nota = "";
        switch (calificacion) {
            case 10: case 9:
                nota = "A";
                break;
            case 8:
                nota = "B";
                break;
            case 7:
                nota = "C";
                break;
            case 6:
                nota = "D";
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                nota = "F";
                break;
            default:
                nota = "Fuera de rango";
                break;
        }
        System.out.println(nota);

        entrada.close();
        
    }
}
