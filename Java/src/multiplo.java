import java.util.Scanner;

public class multiplo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("DIgite numero entero: ");
        num = entrada.nextInt();

        if(num%10 == 0){
            System.out.println("El numero es multiplo de 10");
        }else{
            System.out.println("El numero no es multiplo de 10");
        }
    }
}
