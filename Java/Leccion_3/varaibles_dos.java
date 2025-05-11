import java.util.Scanner;

public class varaibles_dos {
    public static void main(String[] args) {
        var miVariableEntera2 = 36;
        System.out.println(miVariableEntera2);
        var miCadena = "Esta es la clase 3";
        System.out.println("Cadena: " + miCadena);

        var usuario = "Camila";
        var titular = "Programadora";
        var union = usuario + " " + titular;
        System.out.println("Unión: " + union);

        var a = 6;
        var b = 10;

        System.out.println(a + b);

        var nombre = "Sergei";
        System.out.println("Nueva línea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("\t *Menú*");
        System.out.println("Retroceso:  \b" + nombre);
        System.out.println("Comillas simples: \'" + nombre);
        System.out.println("Comillas dobles: \"" + nombre);

        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su nombre: ");
        String usuario2 = entrada.nextLine();
        System.out.println("Nombre Dos: " + usuario2);
        System.out.println("Escriba el título: ");
        var titulo = entrada.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario2);

        System.out.println("Entrada de libros");
        System.out.println("Ingrese el nombre del libro: ");
        var libro = entrada.nextLine();
        
        System.out.println("Ahora ingrese el autor del mismo: ");
        var autor = entrada.nextLine();

        System.out.println("Libro \"" + libro + "\" escrito por " + autor + ", ingresado correctamente.");
    }
}
