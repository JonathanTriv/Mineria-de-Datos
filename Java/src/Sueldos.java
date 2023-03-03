import java.util.Scanner;

public class Sueldos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num,cont=1;
        double sueldos,mayor=0;

        System.out.println("Digita un numero: ");
        num = entrada.nextInt();

        do {
            System.out.println("Digite un sueldo N°"+cont);
            sueldos = entrada.nextDouble();
            cont++;
            if (sueldos > mayor){
                mayor = sueldos;
            }


        }while (cont <= num);

        System.out.println("El sueldo mayor es de: "+mayor);



    }
}
