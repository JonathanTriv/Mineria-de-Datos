import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz1 = {{1,2,3},{5,6,7},{8,9,10}};
        int[][] matriz2 = {{1,2,3},{5,6,7},{8,9,10}};

        int[][] suma = new int[3][3];

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz1[i][j] + matriz2[i][j]);
            }
            System.out.println("");
        }

    }
}
