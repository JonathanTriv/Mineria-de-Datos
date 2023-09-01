import java.util.Scanner;

public class Arreglo5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cont=12,k=0;
        double[] tabla1 = new double[cont];
        double[] tabla2 = new  double[cont];
        double[] union = new double[cont*2];


        System.out.println("Tabla numero 1");
        for (int i=0;i<=cont-1;i++){
            System.out.println("Digita un numero: ");
            tabla1[i] = entrada.nextDouble();

        }
        System.out.println("Tabla numero 2");
        for (int i=0;i<=cont-1;i++){
            System.out.println("Digita un numero: ");
            tabla2[i] = entrada.nextDouble();
        }



        for (int j=0;j < cont;j+=3){
            union[k] = tabla1[j];
            k++;
            union[k] = tabla1[j+1];
            k++;
            union[k] = tabla1[j+2];
            k++;
            union[k] = tabla2[j];
            k++;
            union[k] = tabla2[j+1];
            k++;
            union[k] = tabla2[j+2];
            k++;

        }

        for (int m=0;m<cont*2;m++){
            System.out.println("El numero es: "+union[m]);
        }

    }
}
