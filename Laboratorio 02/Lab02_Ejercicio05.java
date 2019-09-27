import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Scanner;

/**
 * Imprimir, sumar y contar los números que son a la vez multiplos de 2 y de 3
 * que hay entre el 1 y un determinado número ingresado por teclado.
 * 
 * @author Gonzalo Chacaltana Buleje <gchacaltanab@gmail.com>
 */

public class Lab02_Ejercicio05 {

    public static int number;

    private static void inputNumber() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        number = Integer.parseInt(scanner.nextLine());
        scanner.close();
        if (number <= 1) {
            throw new Exception("Ingrese un número mayor a 1");
        }
    }

    private static IntStream getNumbers(int start, int end) {
        return IntStream.rangeClosed(start, end).filter(x -> (x % 3 == 0 && x % 2 == 0));
    }

    private static void printResults() {
        System.out.printf("Los números multiplos de 2 y 3 del 1 al %s son: ", new Object[] { number });
        System.out.println(getNumbers(1, number).boxed().collect(Collectors.toList()));
        System.out.printf("\n La suma de los números es : %d", new Object[] { getNumbers(1, number).sum() });
        System.out.printf("\n La cantidad de número es : %d", new Object[] { getNumbers(1, number).count() });
    }

    public static void main(String[] args) {
        try {
            inputNumber();
            printResults();
        } catch (Exception e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}