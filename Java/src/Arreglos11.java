import java.util.Scanner;

public class Arreglos11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeros[] ={1,2,3,4,5,6,7,8,9,10};
        int numeros2[]= new int[10];
        int cont=0,par=0;

        for (int i=0;i<10;i++){
            if (numeros[i] % 2 == 0){
                par++;
            }
        }

        for (int i=0;i<10;i++){
            if (numeros[i] % 2 == 0){
                numeros2[cont] = numeros[i];
                cont++;
            }else {
                numeros2[par] = numeros[i];
                par++;
            }
        }

        for (int j:numeros2) {
            System.out.print("--"+j+"--");
        }
    }
}
