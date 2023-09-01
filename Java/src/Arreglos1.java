import java.util.Scanner;

public class Arreglos1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cont=5;
        int numeros[] = new int[cont];

        for (int i=cont-1;i>=0;i--){
            System.out.println("Digite un numero: ");
            numeros [i] = entrada.nextInt();

        }
        for (int j:numeros){
            System.out.println("El numero es: "+j);
        }


    }
}
