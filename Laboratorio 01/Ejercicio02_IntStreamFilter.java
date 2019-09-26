
/**
 * Programa que imprima los números impares desde el 1 al 25 (incluir ambos).
 * @author Gonzalo Chacaltana Buleje <gchacaltanab@gmail.com>
*/
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejercicio02_IntStreamFilter {
    public static void main(String[] args) {
        int start = 1, end = 25;
        System.out.println(IntStream.rangeClosed(start, end).filter(s -> s % 2 != 0).boxed().collect(Collectors.toList()));
    }
}
