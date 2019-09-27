import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Imprimir los números del 1 al 100; calcular e imprimir la suma de todos los
 * números pares por un lado e impares por otro.
 * 
 * @author Gonzalo Chacaltana Buleje <gchacaltanab@gmail.com>
 */

public class Lab02_Ejercicio02 {

    private static IntStream getNumbers(int start, int end) {
        return IntStream.rangeClosed(start, end);
    }

    private static IntStream getPairsNumbers(int start, int end) {
        return getNumbers(start, end).filter(i -> i % 2 == 0);
    }

    private static IntStream getOddNumbers(int start, int end) {
        return getNumbers(start, end).filter(i -> i % 2 != 0);
    }

    public static void main(String[] args) {
        int start = 1, end = 100;
        System.out.println(getNumbers(start, end).boxed().collect(Collectors.toList()));
        System.out.println("La suma de los números pares es: " + getPairsNumbers(start, end).sum());
        System.out.println("La suma de los números impares es: " + getOddNumbers(start, end).sum());
    }
}