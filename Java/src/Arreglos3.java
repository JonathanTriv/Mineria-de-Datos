import java.util.Scanner;

public class Arreglos3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        int cont=10,acendente=0,desendente=cont-1;
        int [] numeros = new int[cont];

        for (int i=0;i<cont;i++){
            System.out.println("Digite un numero: ");
            numeros[i] = entrada.nextInt();
        }

        for (int j=0;j<5;j++){
            System.out.println("Numero: "+numeros[desendente]);
            System.out.println("Numero: "+numeros[acendente]);
            desendente--;
            acendente++;
            }


    }
}
