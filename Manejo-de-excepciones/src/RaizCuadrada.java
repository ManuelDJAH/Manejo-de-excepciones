import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double numero = scanner.nextDouble();

        try {
            if (numero < 0) {
                throw new NumeroNeg("El número " + numero + " es negativo.");
            } else {
                double raizCuadrada = Math.sqrt(numero);
                System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
            }
        } catch (NumeroNeg e) {
            System.out.println(e.getMessage());
        }
    }
}
