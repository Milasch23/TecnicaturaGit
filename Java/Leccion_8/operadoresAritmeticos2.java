package Leccion_8;

import java.util.Scanner;

public class operadoresAritmeticos2 {
    public static void main(String[] args) {

        //Ejercicio - Area y perímetro de un rectángulo
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el largo de su rectángulo: ");
        var largo = Integer.parseInt(entrada.nextLine());
        System.out.println("Ahora el alto: ");
        var ancho = Integer.parseInt(entrada.nextLine());

        var perimetro = (largo + ancho) * 2;
        var area = (largo * ancho);

        System.out.println("Perímetro de su rectángulo: " + perimetro + "cm");
        System.out.println("Área de su rectángulo: " + area + "cm");

        //Ejercicio - El mayor de dos números
        System.out.println("Ingrese el número A: ");
        var numA = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el número B");
        var numB = Integer.parseInt(entrada.nextLine());

        var mayorOmenor = (numA > numB) ? "A es el mayor" : "B es el mayor";
        System.out.println(mayorOmenor);

        // /////////////////////////////////////////////////////////////////////////
        // ////////////////////////////////////////////////////////////////////////

        //8.1 - Operadores unarios
        var varA = 7;
        var varB = -varA;

        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);

        // - Operador de negación
        var varC = true;
        var varD = !varC;

        System.out.println("varC: " + varC);
        System.out.println("varD: " + varD);

        // - Operadores unarios de incremento = Preincremento
        var varE = 9;
        var varF = ++varE;

        System.out.println("varE: " + varE);
        System.out.println("varF: " + varF);

        // - Post-incremento

        var varG = 3;
        var varH = varG++;

        System.out.println("varG: " + varG);
        System.out.println("varH: " + varH);

        // - Decremento

        var varI = 3;
        var varJ = --varI;

        System.out.println("varI: " + varI);
        System.out.println("varJ: " + varJ);

        // - Post- decremento

        var varK = 9;
        var varL = varK--;

        System.out.println("varK: " + varK);
        System.out.println("varL: " + varL);


        // 8.2 y 8.3 - Operadores de Igualdad y Relacionales
        var aNum = 6;
        var bNum = 7;
        var cNum = (aNum == bNum);

        System.out.println("Resultado: " + cNum);
        var dNum = (aNum != bNum);
        System.out.println("¿Es distinto?: " + dNum);

        var cadenaA = "Hello";
        var cadenaB = "Hello";
        var cVar = (cadenaA == cadenaB);

        System.out.println("¿Son iguales?: " + cVar);

        var fVar = cadenaA.equals(cadenaB);
        System.out.println("¿Ahora si son iguales?: " + fVar);

        var gVar = aNum >= bNum;
        System.out.println("¿a es mayor o igual?: " + gVar);

        if (aNum % 2 == 0) {
            System.out.println("Número par.");
        }
        else {
            System.out.println("Número impar.");
        }

        var edad = 14;
        var adulto = 21;

        if (edad >= adulto) {
            System.out.println("Es adulto.");
        }
        else {
            System.out.println("No es adulto.");
        }

        //8.4 - Operadores condicionales

        var valorA = 7;

        // Operador AND &&
        var respuesta = valorA >= 0 && valorA <= 10;

        if (respuesta) {
            System.out.println("Dentro del rango");
        }
        else {
            System.out.println("Fuera del rango.");
        }

        // Operador OR ||

        var vacaciones = false;
        var diaLibre = false; 

        if (vacaciones || diaLibre) {
            System.out.println("El padre puede ir al juego de su hijo.");
        }
        else {
            System.out.println("El padre no puede asistir al juego de su hijo.");
        }

        // 8.5 Operador Ternario

        var resultadoT = (5 > 4) ? "Verdadero" : "Falso";
        System.out.println("Resultado: " + resultadoT);

        var numT = 7;
        var resT = (numT % 2 == 0) ? "Es par" : "Es impar";
        System.out.println(resT);

        // 8.6 - Prioridad de los operadores

        var x = 5;
        var y = 10;

        var z = ++x + y--;
        System.out.println("Resultado: " + z);

        var solucionAritmetica = ((4 + 5) * 6 / 3);
        System.out.println(solucionAritmetica);

        entrada.close();
        
    }
    

}