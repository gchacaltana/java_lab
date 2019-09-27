import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Scanner;

/**
 * Introducir dos valores A y B: Si A es mayor o igual que B, calcular e
 * imprimir la suma de: 10 + 14 + 18 + ... + 50; si A dividido entre B es menor
 * o igual a 30, calcular e imprimir el valor de la suma de cuadrados de A y B.
 * 
 * @author Gonzalo Chacaltana Buleje <gchacaltanab@gmail.com>
 */

public class Lab02_Ejercicio06 {

    public static int a, b;

    private static void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el valor de b: ");
        b = Integer.parseInt(scanner.nextLine());
        scanner.close();
    }

    private static void switchPrintResult() throws Exception {
        if (a >= b) {
            printResultsA();
        }
        if ((a / b) <= 30) {
            printResultsB();
        }
    }

    private static void printResultsA() {
        int start = 10, end = 50, sequence = 4;
        int max = ((end - start) / sequence) + 1;
        System.out.println("a >= b : ");
        System.out.println(IntStream.iterate(start, n -> n + sequence).limit(max).boxed().collect(Collectors.toList()));
    }

    private static void printResultsB() {
        System.out.println("(a/b)<=30 : ");
        System.out.println("a^2 + b^2 : " + (Math.pow(a, 2) + Math.pow(b, 2)));
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