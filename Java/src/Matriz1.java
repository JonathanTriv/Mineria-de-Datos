import java.util.Scanner;

public class Matriz1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz;
        int filas,columnas;

        System.out.println("Digite el nuemro de filas: ");
        filas = entrada.nextInt();
        System.out.println("Digite el nuemro de columnas: ");
        columnas = entrada.nextInt();

        matriz = new int[filas][columnas];

        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                System.out.print("Digite la ["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }


        if (filas == columnas){
            System.out.println("La matriz es simetrica");
        }else {
            System.out.println("La matriz no es simetrica");
        }
    }
}
