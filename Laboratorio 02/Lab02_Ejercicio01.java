import java.util.Scanner;

/**
 * Introducir un número por teclado e imprimir en pantalla si el número es par o
 * impar.
 * 
 * @author Gonzalo Chacaltana Buleje <gchacaltanab@gmail.com>
 */

public class Lab02_Ejercicio01 {
    
    private static int number;

    private static void inputNumber() {
        System.out.print("Ingresa un número: ");
        Scanner scanner = new Scanner(System.in);
        number = Integer.parseInt(scanner.nextLine());
        scanner.close();
    }

    private static void printResult() {
        System.out.print("El número es " + ((number % 2 == 0) ? "Par" : "Impar"));
    }

    public static void main(String[] args) {
        inputNumber();
        printResult();
    }
}