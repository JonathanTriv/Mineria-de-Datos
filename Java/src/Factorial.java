import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int num=0;
        float factorial=1;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el numero: ");
        num = entrada.nextInt();

        for (int i=1;i<=num;i++){
            factorial*=i;
            System.out.println(factorial);

        }
        System.out.println("Este es el factorial de "+factorial);
    }
}