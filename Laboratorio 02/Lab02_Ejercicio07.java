import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Scanner;

/**
 * Introducir los valores A,B,C: Si A dividido entre B es mayor a 30, calcular e
 * imprmir A/C*B^3; Si A divido entre B es menor o igual a 30, calcular la suma
 * e imprimir: 2^2 + 4^2 + 6^2 + .... + 30^2
 * 
 * @author Gonzalo Chacaltana Buleje <gchacaltanab@gmail.com>
 */

public class Lab02_Ejercicio07 {

    public static int a, b, c;

    private static void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el valor de b: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el valor de c: ");
        c = Integer.parseInt(scanner.nextLine());
        scanner.close();
    }

    private static void switchPrintResult() throws Exception {
        System.out.println("El resultado es: ");
        if ((a / b) > 30) {
            printResultsA();
        }
        if ((a / b) <= 30) {
            printResultsB();
        }
    }

    private static void printResultsA() {
        System.out.println("(a/c)*b^3: " + ((a / c) * Math.pow(b, 3)));
    }

    private static void printResultsB() {
        int start = 2, end = 30, sequence = 2;
        int max = ((end - start) / sequence) + 1;
        int sum = IntStream.iterate(start, n -> n + sequence).limit(max).map(x -> (int)Math.pow(x, 2)).sum();
        System.out.println("2^2 + 4^2 + 6^2 + .... + 30^2 : " + sum);
    }

    public static void main(String[] args) {
        try {
            inputNumbers();
            switchPrintResult();
        } catch (Exception e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}