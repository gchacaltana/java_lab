import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

/**
 * Imprimir y contar los números multiplos de 3 que hay entre 1 y 100.
 * 
 * @author Gonzalo Chacaltana Buleje <gchacaltanab@gmail.com>
 */

public class Lab02_Ejercicio04 {

    private static IntStream getNumbers(int start, int end) {
        return IntStream.rangeClosed(start, end).filter(x -> (x % 3 == 0));
    }

    public static void main(String[] args) {
        int start = 1, end = 100;
        System.out.println(getNumbers(start, end).boxed().collect(Collectors.toList()));
        System.out.println(getNumbers(start, end).count());
    }
}