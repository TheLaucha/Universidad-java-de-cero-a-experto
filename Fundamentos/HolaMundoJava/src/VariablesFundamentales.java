
import java.util.Scanner;

public class VariablesFundamentales {
    public static void main (String args[]){
        // Variables numéricas
        int entero = 10;        // Variable entera
        double decimal = 3.14;  // Variable de punto flotante (número decimal)
        long largo = 123456789L; // Variable entera larga

        // Variable de texto
        String texto = "Hola, mundo!";

        // Variable booleana (verdadero o falso)
        boolean esCierto = true;

        // Caracter (almacena un solo carácter)
        char caracter = 'A';

        // Imprimir el contenido de las variables
        System.out.println("Numero entero: " + entero);
        System.out.println("Numero decimal: " + decimal);
        System.out.println("Numero largo: " + largo);
        System.out.println("Texto: " + texto);
        System.out.println("Booleano: " + esCierto);
        System.out.println("Caracter: " + caracter);
        
        // Ejercicios
        // 1 - Declara dos variables numéricas (por ejemplo, int o double) y realiza operaciones como suma, resta, multiplicación y división entre ellas. Imprime los resultados.
        int num1 = 5;
        int num2 = 7;
        System.out.println("Suma: " + (num1 + num2));
        
        // Uso de Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario: ");
        String usuario = scanner.nextLine();
        System.out.println("usuario = " + usuario);
        
        // Ejercicio de udemy
        /*
        Se solicita incluir la siguiente información acerca de un libro:
        titulo
        autor
        Debes imprimir la información en el siguiente formato:
        <titulo> fue escrito por <autor>
        */
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el titulo: ");
        String titulo = lector.nextLine();
        System.out.println("Ingrese el autor: ");
        String autor = lector.nextLine();
        System.out.println(titulo + " fue escrito por: " + autor);
    }
}
