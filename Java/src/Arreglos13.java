import java.util.Scanner;

public class Arreglos13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = {7,12,67,89,91,98,100,105,110,120};
        int num=0;

        System.out.println("Digita un numero a buscar");
        num = entrada.nextInt();
        for (int i=0;i<10;i++) {
                if (num == numeros[i]){
                    System.out.println("El numero esta en la pos: "+i);
                    break;
                } else if (i == (numeros.length-1)) {
                    System.out.println("NO esta");
                }

        }

    }
}
