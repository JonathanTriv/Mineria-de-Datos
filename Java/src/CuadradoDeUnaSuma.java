import java.util.Scanner;

public class CuadradoDeUnaSuma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a, b, resultado;

        System.out.println("Digite a: ");
        a = entrada.nextDouble();
        System.out.println("Digite b: ");
        b = entrada.nextDouble();

        resultado = Math.pow(a, 2) + Math.pow(b, 2) + (2 * a * b);

        System.out.println("Cuadrado de una suma es : "+resultado);

    }
}
