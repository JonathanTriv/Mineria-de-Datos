import java.util.Scanner;

public class Arreglo6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cont=10,menor=0,mayor=0;
        int[] numeros = new int[cont];

        System.out.println("Digita los 10 numeros");

        for (int i=0;i<cont;i++){
            System.out.println(i+1+" Digite un numero: ");
            numeros[i] = entrada.nextInt();
        }

        for (int j=0;j<cont-1;j++){
            if (numeros[j] < numeros[j+1]){
                menor++;
            } else if (numeros[j] > numeros[j+1]) {
                mayor++;
            }
        }
        if (menor == cont-1){
            System.out.println("Esta en orden desendente");
        } else if (mayor == cont-1) {
            System.out.println("Esta en orden asendente");
        }else {
            System.out.println("Esta desordenada");
        }
    }
}
