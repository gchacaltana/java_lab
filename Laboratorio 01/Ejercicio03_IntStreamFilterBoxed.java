
/**
 * Programa que imprima los números pares desde el 40 al 60 (incluir ambos).
 * @author Gonzalo Chacaltana Buleje <gchacaltanab@gmail.com>
*/
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejercicio03_IntStreamFilterBoxed {
    public static void main(String[] args) {
        int start = 40, end = 60;
        System.out.print(IntStream.rangeClosed(start, end).filter(s -> s % 2 == 0).boxed().collect(Collectors.toList()));
    }
}
