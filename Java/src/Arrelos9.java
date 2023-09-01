import java.util.Scanner;

public class Arrelos9 {
    public static void main(String[] args) {
        Scanner entradra = new Scanner(System.in);


        int num,cont=0;
        int[] numeros = new int[10];
        boolean ordenado = true;

        do {
            cont = 0;
            for (int i=0;i<5;i++){
                System.out.println("Introdusca el "+(i+1)+" numero para la tabla: ");
                numeros[i] = entradra.nextInt();
                cont++;

            }
            for (int i=0;i<4;i++){
                if (numeros[i] < numeros[i+1]){
                    ordenado = true;
                } else if (numeros[i] > numeros[i+1]) {
                    ordenado = false;
                    break;
                }
            }

            if (ordenado == false){
                System.out.println("La tabla no esta ordenada de forma desendente, porfavor digite de nuevo: ");
            }

        }while (ordenado == false);


        while (cont < numeros.length){
            System.out.println("Digita un numero: ");
            num = entradra.nextInt();
            cont++;
            int j=0,pos=0;
            while (numeros[j] < num && numeros[j] !=0 && j<9){
                pos++;
                j++;
            }
            for (int i=8;i>=pos;i--){
                numeros[i+1] = numeros[i];
            }
            System.out.println(pos);
            numeros[pos] = num;
        }

        for (int i=0;i<10;i++){
            System.out.println("Tabla "+numeros[i]);
        }


    }
}
