/**
 * Programa que imprima los números impares desde el 100 hasta el 1; calcule e imprima 
 * la suma de los elementos
 * 
 * @author Gonzalo Chacaltana Buleje <gchacaltanab@gmail.com>
 */
import java.util.stream.IntStream;

public class Ejercicio08_IntStreamMapFilter {
    private static IntStream getNumbers(int start, int end) {
        return IntStream.rangeClosed(start, end).map(n -> end - n + start - 1).filter(i -> i%2!= 0);
    }
    public static void main(String[] args) {
        getNumbers(1,100).forEach(System.out::println);
        System.out.println("La suma de los números es " + getNumbers(1,100).sum());
    }
}
