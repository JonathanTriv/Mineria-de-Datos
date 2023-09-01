import java.util.Scanner;

public class Arreglos10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeros[] = {1,2,3,4,5,6,7,8,9,10};
        int copia[] = new int[9];
        int num=0,pos=0;

        do {
            System.out.println("Digita la posicion a cambiar de 0 a 9: ");
            pos = entrada.nextInt();

        }while (pos < 0 || pos > 9);

        for (int i=pos;i<9;i++){
            numeros[i] = numeros[i+1];

        }
        System.arraycopy(numeros,0,copia,0,copia.length);

        for (int j:copia) {
            System.out.println("Numero: "+j);
        }

    }
}
