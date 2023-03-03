import java.util.Scanner;

public class Par {
    public static void main(String[] args) {

        int num;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        num = entrada.nextInt();

        if (num < 0 && num % 2 == 0) {
            System.out.println("El numero es negativo y es par");

        } else if (num < 0 && num % 2 != 0) {
            System.out.println("EL numero es negativo y es impar");
        } else if (num > 0 && num % 2 == 0) {
            System.out.println("EL numero es positivo y es par");
        } else {
            System.out.println("EL numero es positivo y es impar");
        }
    }
}
