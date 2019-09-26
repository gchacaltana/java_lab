
/**
 * Calcular e imprimir el producto: 1 * 2 * 3 * ... * 10
 * @author Gonzalo Chacaltana Buleje <gchacaltanab@gmail.com>
*/

public class Ejercicio06_Multiple {
    private static int multiply(int n) {
        return (n <= 1) ? 1 : n * multiply(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print(multiply(n));
    }
}
