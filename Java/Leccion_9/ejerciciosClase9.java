package Leccion_9;

import java.util.Scanner;

public class ejerciciosClase9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Ejercicio 5 
        Float notaA, notaB, notaC, sumatoria;

        System.out.println("Escriba a continuación, las tres calificaciones. En orden: ");
        notaA = Float.parseFloat(entrada.nextLine());
        notaB = Float.parseFloat(entrada.nextLine());
        notaC = Float.parseFloat(entrada.nextLine());

        sumatoria = notaA + notaB + notaC;

        System.out.println("Suma total de las calificaciones ingresadas: " + sumatoria);

        //Ejercicio 6

        Float khadgar, varian, anduin, total;
        System.out.println("Ingrese la cantidad de dinero en posesión de Khadgar: ");
        khadgar = Float.parseFloat(entrada.nextLine());

        varian = khadgar / 2;
        anduin = (khadgar + varian) / 2;
        total = khadgar + varian + anduin;

        System.out.println("Dinero de Varian: USD " + varian);
        System.out.println("Dinero de Anduin: USD " + anduin);
        System.out.println("Dinero de los tres: USD " + total);

        //Ejercicio 7
        final int sueldo = 1000;
        int comision = 150, venta;
        float sueldoMensual, carroVenta, porcVenta, precioTotal; 
        
        System.out.println("Autos vendidos: ");
        venta = Integer.parseInt(entrada.nextLine());
        System.out.println("Precio de un vehiculo: ");
        carroVenta = Float.parseFloat(entrada.nextLine());

        comision *= venta;
        precioTotal = carroVenta * venta;
        porcVenta = precioTotal * 0.05f;
        sueldoMensual = sueldo + comision + porcVenta;

        System.out.println("Sueldo mensual: $" + sueldoMensual);
    }
}
