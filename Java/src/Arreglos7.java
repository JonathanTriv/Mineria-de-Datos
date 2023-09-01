import java.util.Scanner;

public class Arreglos7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cont=10,pos,num;
        int[] numeros = new int[cont];

        System.out.println("Digita los numeros de la tabla");

        for (int i=0;i<=cont-3;i++){
            System.out.println("Digita un numero: ");
            numeros[i] = entrada.nextInt();
        }

        do {
            System.out.println("Digite una posicion del nuevo numero del 1 al 10");
            pos = entrada.nextInt()+1;
        }while (pos > 9 || pos < 0);
        System.out.println("Digita un nuemro a ingresar: ");
        num = entrada.nextInt();

        if(pos >=8){
            numeros[pos] = num;
        }else {
            for(int j=cont-1;j>pos;j--){
                numeros[j] = numeros[j-1];
            }
            numeros[pos] =num;
        }

        for (int k=0;k<cont;k++){
            System.out.println(k+1+" Numeros: "+numeros[k]);
        }
    }
}
