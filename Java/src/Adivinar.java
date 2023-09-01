import java.util.Random;
import java.util.Scanner;

public class Adivinar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int num,cont=0,random;

        random = aleatorio.nextInt(100)+1;
        System.out.println(random);
        System.out.println("---Adivina el numero---");
        while (cont < 3){
            System.out.println("Digite un numero: ");
            num = entrada.nextInt();
            System.out.println("Intento numero: "+(cont+1));
            if (num > random){
                System.out.println("El numero es menor");

            } else if (num < random) {
                System.out.println("El numero es mayor");
            }else {
                System.out.println("---Felicidades Adivinaste---");
                cont = 3;
            }
            cont++;


        }
        if (cont == 3){
            System.out.println("Se terinaron los intentos el numero era: "+random);
        }

    }
}
