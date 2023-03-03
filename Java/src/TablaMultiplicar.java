import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num,multi;

        System.out.println("Digita un numero: ");
        num = entrada.nextInt();

        for (int i=1;i<=10;i++){
            multi = num * i;
            System.out.println(num +" * "+i+" = "+multi);
        }
    }
}
