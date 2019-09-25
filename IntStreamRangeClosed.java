/**
 * Programa que imprima los primeros 25 números naturales.
 * @author Gonzalo Chacaltana Buleje <gchacaltanab@gmail.com>
*/
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamRangeClosed {
    public static void main(String[] args) {
        int start = 1, end = 25;
        System.out.print(IntStream.rangeClosed(start, end).boxed().collect(Collectors.toList()));
    }
}
