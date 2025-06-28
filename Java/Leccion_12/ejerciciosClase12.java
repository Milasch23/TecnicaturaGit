package Leccion_12;

import java.util.Scanner;

public class ejerciciosClase12 {
    public static void main(String[] args) {
        //Ejercicio 1

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número total de horas:");
        int totalHoras = entrada.nextInt();

        int semanas = totalHoras / 168;
        int horasRestantes = totalHoras % 168;

        int dias = horasRestantes / 24;
        int horas = horasRestantes % 24;

        System.out.println(totalHoras + " horas equivalen a:");
        System.out.println(semanas + " semanas");
        System.out.println(dias + " días");
        System.out.println(horas + " horas");

        //Ejercicio 2

        System.out.print("Ingrese el valor de a: ");
        double a = entrada.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = entrada.nextDouble();

        
        double a2 = Math.pow(a, 2); // a^2
        double b2 = Math.pow(b, 2); // b^2
        double dosab = 2 * a * b;   // 2ab

        double resultado = a2 + b2 + dosab;

        
        System.out.println("El resultado de (a + b)^2 es: " + resultado);

        //Ejercicio 3

        System.out.print("Ingrese la calificación de Participación (10%): ");
        double participacion = entrada.nextDouble();

        System.out.print("Ingrese la calificación del Primer Examen Parcial (25%): ");
        double primerParcial = entrada.nextDouble();

        System.out.print("Ingrese la calificación del Segundo Examen Parcial (25%): ");
        double segundoParcial = entrada.nextDouble();

        System.out.print("Ingrese la calificación del Examen Final (40%): ");
        double examenFinal = entrada.nextDouble();


        double calificacionFinal = (participacion * 0.10) +
                                   (primerParcial * 0.25) +
                                   (segundoParcial * 0.25) +
                                   (examenFinal * 0.40);

        
        System.out.println("La calificación final del estudiante es: " + calificacionFinal);

        entrada.close();
        
    }
}
