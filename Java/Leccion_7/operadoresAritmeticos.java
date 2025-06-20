package Leccion_7;

public class operadoresAritmeticos {

    public static void main(String[] args) {
        int num1 = 7, num2 = 9;
        var solucion = num1 + num2;
        System.out.println("Suma: " + solucion);
        
        solucion = num1 - num2;
        System.out.println("Resta: " + solucion);

        solucion = num1 * num2;
        System.out.println("Multiplicación: " + solucion);

        solucion = num1 / num2;
        System.out.println("División: " + solucion);

        var solucion2 = 3.4D / num2;
        System.out.println("Variable de división: " + solucion2);

        solucion = num1 % num2;
        System.out.println("Módulo: " + solucion);

        if (num1 % 2 == 0) 
            System.out.println("El número es par");
        else 
            System.out.println("El número es impar");

        int varNum1 = 6, varNum2 = 13;
        int varNum3 = varNum1 + 5 - varNum2;
        System.out.println("Resultado: " + varNum3);

        varNum1 += 1;
        System.out.println("Resultado 2: " + varNum1);

        varNum2 -= 1;
        System.out.println("Resultado 3: " + varNum2);

        varNum3 *= 2;
        System.out.println("Resultado 4: " + varNum3);

        varNum2 /= 2;
        System.out.println("Resultado 5: " + varNum2);

        varNum1 %= 2;
        System.out.println("Resultado 6: " + varNum1);

    }
}