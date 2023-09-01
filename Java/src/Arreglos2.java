import java.util.Scanner;

public class Arreglos2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double mediaNeg,mediaPos,sumNeg=0,sumPos=0;
        int cont=5,contPos=0,contNeg=0,contCeros=0;
        double numeros [] = new double[cont];

        for (int i=0;i<cont;i++){
            System.out.println("Digite un numero: ");
            numeros [i]= entrada.nextDouble();
            if (numeros[i] < 0){
                sumNeg += numeros[i];
                contNeg++;
            }else if (numeros[i] > 0){
                sumPos += numeros[i];
                contPos++;
            }else {
                contCeros++;
            }

        }

        mediaPos = sumPos / contPos;
        mediaNeg = sumNeg / contNeg;


        for (double k:numeros){
            System.out.println("Numero: "+k);
        }

        System.out.println("La media de los numeros positivos del arreglo es: "+mediaPos);
        System.out.println("La media de los numeros negativos del arreglo es: "+mediaNeg);
        System.out.println("La cantidad de ceros es de: "+contCeros);

    }
}
