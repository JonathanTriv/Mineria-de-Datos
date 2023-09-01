import java.util.Scanner;

public class Matriz4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[7][7];


        int val=0;
        for (int i=0;i<7;i++){
            for (int j=6;j>=0;j--){
                val = j+i;
                if (val == 6){
                    matriz[i][j]= 1;
                }


            }
        }

        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
