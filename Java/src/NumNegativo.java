import java.util.Arrays;
import java.util.Scanner;

public class NumNegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num,negativo=0;


        for (int i = 1; i<= 10;i++){
            System.out.println("Digite un numero: ");
            num = entrada.nextInt();
            if (num < 0){
                negativo++;
            }
        }
        System.out.println("La cantidad de numeros negativos a sido: "+negativo);

    }
}
