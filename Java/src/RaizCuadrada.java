import java.util.Random;
import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        long suma=1;
        int num=0;

        System.out.println("DIgite num: ");
        num = entrada.nextInt();

        for (int i=1;i<=num;i++){
            suma *= i;
        }
        System.out.println("LEl factorial es: "+suma);
    }
}
