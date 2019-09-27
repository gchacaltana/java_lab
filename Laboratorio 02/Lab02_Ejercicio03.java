import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

/**
 * Introducir 2 números por teclado. Imprimir los números que hay entre ellos,
 * comenzando por el menor. Contar cuántos hay, cuántos son pares, y cuál es la
 * suma de todos los impares.
 * 
 * @author Gonzalo Chacaltana Buleje <gchacaltanab@gmail.com>
 */

public class Lab02_Ejercicio03 {

    private static int a, b, minor, major;

    private static void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingresa otro número: ");
        b = Integer.parseInt(scanner.nextLine());
        scanner.close();
        process();
    }

    private static void process() {
        minor = (a < b) ? a : b;
        major = (a > b) ? a : b;
    }

    private static IntStream getNumbers() {
        return IntStream.range(minor + 1, major);
    }

    private static void printResults() {
        System.out.printf("Los números del %d al %d son : \n", new Object[] { minor, major });
        System.out.println(getNumbers().boxed().collect(Collectors.toList()));
        System.out.printf("\n¿Cuántos números hay?: %d", new Object[] { getNumbers().count() });
        System.out.printf("\n¿Cuántos son números pares?: %d",
                new Object[] { getNumbers().filter(x -> (x % 2 == 0)).count() });
        System.out.printf("\n¿Cuál es la suma de los números impares?: %d",
                new Object[] { getNumbers().filter(x -> (x % 2 != 0)).sum() });
    }

    public static void main(String[] args) {
        inputNumbers();
        printResults();
    }
}