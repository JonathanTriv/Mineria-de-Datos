import java.util.Scanner;

public class Arreglos12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1[] = {1,2,3,13,5,14,7,15,9,10};
        int num2[] = {20,21,22,23,24,25,26,27,28,29,30};
        int total[] = new int[20];
        int ant = 0,cabios=0;
        boolean ordenado = false;

        while (ordenado != true){
            for (int i=0;i<9;i++){
                if (num1[i] > num1[i+1]){
                    ant = num1[i];
                    num1[i] = num1[i+1];
                    num1[i+1] = ant;
                    cabios++;
                }
            }
            if (cabios == 0){
                ordenado = true;
            }
                cabios = 0;

        }

        for (int j=0;j<10;j++){
            System.out.println(num1[j]);
        }
    }
}
