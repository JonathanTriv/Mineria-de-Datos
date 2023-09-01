import java.util.Scanner;

public class Arregos4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cont=10,num1=0;
        int[] numeros1 = new int[cont];
        int[] numeros2 = new int[cont];
        int[] resutado  =new  int[cont*2];

        for (int i=0;i<=cont-1;i++){
            System.out.println("Digite un numero para lista 1: ");
            numeros1[i] = entrada.nextInt();

        }
        System.out.println("-----Lista 2-----");
        for (int i=0;i<=cont-1;i++){
            System.out.println("Digite un numero para lista 2: ");
            numeros2[i] = entrada.nextInt();
        }


        for (int j=0;j<cont;j++) {
            resutado[num1] = numeros1[j];
            num1++;
            resutado[num1] = numeros2[j];
            num1++;

        }


        for (int h=0;h<cont*2;h++) {
            System.out.println("Tabla 3: "+resutado[h]);
        }

    }
}
