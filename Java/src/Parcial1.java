import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* Jonathan Triviño */
public class Parcial1 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

        int menu = 0;

        do {
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1. Dados");
            System.out.println("2. Adivinar el numero");
            System.out.println("3. Apueta Dados");
            System.out.println("4. Salir");

            System.out.println("Digita una opcion: ");
            menu = entrada.nextInt();
            switch (menu) {
                case 1:
                    int tiradas = 1,dado1=0 , dado2=0;

                    do {
                        tiradas++;
                        System.out.println("");
                        System.out.println("Tirada " + tiradas);
                        dado1 = aleatorio.nextInt(6) + 1;
                        System.out.println("Dado 1 = " + dado1);
                        dado2 = aleatorio.nextInt(6) + 1;
                        System.out.println("Dado 2 = " + dado2);


                    }while (dado1 != dado2);
                    System.out.println("");
                    System.out.println("Las tiradas Totales fueron: " + tiradas);
                    break;
                case 2:
                    int cont [] = new int[5],aux=0,mayor=0,menor=100,intentos=1,num,numad;;
                    int i=0,c=0;
                    int closestSmaller = 0;
                    int closestLarger = 0;
                    numad = aleatorio.nextInt(100) + 0;
                    System.out.println(numad);

                    do {

                        System.out.println("Intento Numero " + intentos);
                        System.out.println("Digite el numero a adivinar entre 0 y 100: ");
                        num = entrada.nextInt();

                        while (i<5){
                            cont[i] = num;
                            i++;
                        }
                        i=0;
                        i = (c+1);
                        c++;

                        Arrays.sort(cont);

                        for (int j=0;j<5;j++){

                            if (cont[j] < numad) {
                                closestSmaller = cont[j];

                            }
                            if (cont[j] > numad ) {
                                closestLarger = cont[j];

                            }
                        }



                        if (num > numad && intentos != 1 && menor != num ) {
                            System.out.println("El numero es menor a "+num+" y mayor "+closestSmaller);
                        } else if (num > numad) {
                            System.out.println("El numero es menor a "+num+" y mayor a 0");
                        } else if (num < numad && intentos != 1 && mayor != num && closestLarger !=0) {
                            System.out.println("El numero es mayor a "+num+" y menor "+closestLarger);
                        } else if (num < numad){
                            System.out.println("El numero es mayor a "+num+" y menor a 100");
                        } else{
                            System.out.println("");
                            System.out.println("Felicidades adivinaste");
                            intentos+=5;
                        }
                        System.out.println("");
                        intentos++;

                    } while (intentos < 6);

                    if (intentos > 5){
                        System.out.println("Se terminaron los 5 intentos el numero era: " + numad);
                    }

                    break;
                case 3:
                    int dados=0,dados2=0,dinero=0,dado11=0,dado22=0;
                    boolean juego = true;

                    dado11 = aleatorio.nextInt(6)+1;
                    dado22 = aleatorio.nextInt(6)+1;

                    System.out.println("Cuanto dinero quieres apostar: ");
                    dinero = entrada.nextInt();

                    do {
                        System.out.println("");
                        System.out.println("Comienza el juego");
                        System.out.println("Dado 1 = "+ dado11);
                        System.out.println("Dado 2 = "+dado22);
                        dados = dado11 +dado22;
                        System.out.println("Suma = "+dados);
                        System.out.println("");

                        if ((dados == 7) || (dados == 11)){
                            System.out.println("Felicidades duplicaste tu apuesta ");
                            System.out.println("Tu dinero ahora es: "+(dinero*2));
                            juego = false;
                        } else if ((dados == 2) || (dados == 3) || (dados == 12)) {
                            System.out.println("Mala suerte perdite tu apuesta");
                            juego = false;
                        } else if ((dados == 4) || (dados == 5) || (dados == 6) || (dados == 8) || (dados == 9) || (dados == 10)) {
                            System.out.println("Entrando en la segunda Etapa");
                            while (juego != false){
                                dado11 = aleatorio.nextInt(6)+1;
                                dado22 = aleatorio.nextInt(6)+1;
                                dados2 = dado11 + dado22;
                                System.out.println("");
                                System.out.println("Dado ext 1 = "+ dado11);
                                System.out.println("Dado ext 2 = "+dado22);
                                System.out.println("Suma ext = "+dados2);
                                System.out.println("");
                                if (dados == dados2){
                                    System.out.println("Obtuviste el mismo resultado que en la primera etapa Felicidades duplicaste tu apuesta");
                                    System.out.println("Tu dinero ahora es: "+(dinero*2));
                                    juego = false;
                                } else if (dados2 == 7) {
                                    System.out.println("Mala suerte perdite tu apuesta");
                                    juego = false;
                                }
                            }

                        }

                    }while (juego != false);
                    break;
                case 4:
                    System.exit(0);
            }



        } while (menu < 5 || menu > 0);

    }
}
