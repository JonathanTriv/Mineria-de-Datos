import java.util.Scanner;

public class numeroMayoresOMenores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num1,num2;
        String nom ,ini;

        System.out.println("NUM 1: ");
        num1 =entrada.nextFloat();
        System.out.println("NUM 2: ");
        num2 = entrada.nextFloat();


        if (num1 < num2){
            System.out.println("el "+num2+" es mayor");
        }else if (num2 < num1){
            System.out.println("el "+num1+" es mayor");
        }else{
            System.out.println("Son iguales");
        }
    }
}
