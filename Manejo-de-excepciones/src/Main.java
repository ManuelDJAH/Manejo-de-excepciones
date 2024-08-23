import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String lectTeclado = scanner.nextLine();

        CaracterEn util = new CaracterEn();
        try {
            char caracter = util.caracterEn(lectTeclado, 7);
            System.out.println("El carácter en la posición 7 es: " + caracter);
        } catch (Exception e) {
            System.out.println("Intentaste recuperar una posición que no existe en la cadena de caracteres.");
        }
    }
}
