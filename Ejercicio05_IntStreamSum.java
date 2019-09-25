
/**
 * Calcular e imprimir la suma: 1 + 2 + 3 + 4 + 5 + ... + 50
 * @author Gonzalo Chacaltana Buleje <gchacaltanab@gmail.com>
*/
import java.util.stream.IntStream;

public class Ejercicio05_IntStreamSum {
    public static void main(String[] args) {
        int start = 1, end = 50;
        System.out.println(IntStream.rangeClosed(start, end).sum());
    }
}
