import java.util.Scanner;

public class Carros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salario=1000f,carros,comosion = 150f,valcar5;
        int carrosven;

        System.out.println("Carros vendidos: ");
        carrosven = entrada.nextInt();
        System.out.println("Valor de los carros vendidos: ");
        carros = entrada.nextFloat();

        salario += (comosion * carrosven) + (carros * 5/100);

        System.out.println("El salario del empleado es: "+salario);
    }
}
