package Leccion_5;

public class primitivos2 {
    public static void main(String[] args) {
        //Inferencia de tipos var y primitivos
        var numEntero = 32;
        System.out.println("Entero: " + numEntero);
        var numFloat = 7.5F;
        System.out.println("Flotante: " + numFloat);
        var numDouble = 8.24;
        System.out.println("Double: " + numDouble);

        //Tipos primitivos char
        char miVariableChar = 'a';
        System.out.println("Char: " + miVariableChar);

        char varChar = '\u0024';
        System.out.println(varChar);

        var varCharDec = 38;
        System.out.println(varCharDec);

        var miVariableChar1 = 'a';
        System.out.println("Char: " + miVariableChar1);

        var varChar1 = '\u0024';
        System.out.println(varChar1);

        var varCharDec1 = 38;
        System.out.println(varCharDec1);

        int varEnteroChar = '&';
        System.out.println(varEnteroChar);

        int characterChar = 's';
        System.out.println(characterChar);

    }
}
