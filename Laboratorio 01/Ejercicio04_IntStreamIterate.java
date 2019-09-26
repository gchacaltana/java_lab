
/**
 * Imprimir los números: 48, 52, 56, ..., 120
 * @author Gonzalo Chacaltana Buleje <gchacaltanab@gmail.com>
*/
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejercicio04_IntStreamIterate {
    public static void main(String[] args) {
        int start = 48, end = 120, sequence = 4;
        int max = ((end - start) / sequence) + 1;
        System.out.print(IntStream.iterate(start, n -> n + sequence).limit(max).boxed().collect(Collectors.toList()));
    }
}
