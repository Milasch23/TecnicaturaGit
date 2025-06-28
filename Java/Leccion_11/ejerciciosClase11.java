package Leccion_11;

import java.util.Scanner;

public class ejerciciosClase11 {
    public static void main(String[] args) {

        //Ejercicio 1

        Float nota1, nota2, nota3, promedio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba a continuación, las tres calificaciones. En orden: ");
        nota1 = Float.parseFloat(entrada.nextLine());
        nota2 = Float.parseFloat(entrada.nextLine());
        nota3 = Float.parseFloat(entrada.nextLine());

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 70) {
            System.out.println(promedio + ": Alumno aprobado");
        }
        else if (promedio < 70) {
            System.out.println(promedio + ": Alumno desaprobado");
        }
        else {
            System.out.println("Error");
        }

        //Ejercicio 2 

        Float compra, precio_final, descuento;
        descuento = 0.2f;
        System.out.println("Escriba el pago del cliente: ");
        compra = Float.parseFloat(entrada.nextLine());
        if (compra >= 100) {
            precio_final = compra - (compra * descuento);
            System.out.println("Si aplica descuento. Precio final: $" + precio_final);
        }
        else {
            System.out.println("No aplica descuento.");
        }

        // Ejercicio 3
        Integer num1, num2, resultado = null;
        System.out.println("Ingrese dos números");
        num1 = Integer.parseInt(entrada.nextLine());
        num2 = Integer.parseInt(entrada.nextLine());

        if (num1 == num2) {
            resultado = num1 * num2;
        }
        else if (num1 > num2) {
            resultado = num1 - num2;
        }
        else if (num1 < num2) {
            resultado = num1 + num2;
        }
        System.out.println("Resultado: " + resultado);

        entrada.close();
    }
}
