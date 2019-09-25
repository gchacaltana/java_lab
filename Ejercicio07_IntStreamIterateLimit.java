
/**
 * Calcular e imprimir la suma: 1 + 2 + 3 + 4 + 5 + ... + 50
 * 
 * @author Gonzalo Chacaltana Buleje <gchacaltanab@gmail.com>
 */
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Ejercicio07_IntStreamIterateLimit {
    public static void main(String[] args) {
        int start = 50, end = 20, sequence = 2;
        int max = ((start - end) / sequence) + 1;
        System.out.print(IntStream.iterate(start, n -> n - sequence).limit(max).boxed().collect(Collectors.toList()));
    }
}
