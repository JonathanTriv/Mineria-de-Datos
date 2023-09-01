import java.util.Scanner;

public class Arreglo8 {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int ultimo=0;


        ultimo = numeros[9];

        for (int i=8;i>=0;i--){
            numeros[i+1] = numeros[i];

        }

        numeros[0] = ultimo;


        for (int j=0;j<=9;j++){
            System.out.println(j+1+" Numero: "+numeros[j]);
        }


    }
}
