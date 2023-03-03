import java.util.Scanner;

public class SueldosMayores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double sueldos,SumSueldos=0;
        int cant=10,Mayor1000=0;

        for (int i = 1;i<=cant;i++){
            System.out.println("Digita el sueldo: ");
            sueldos = entrada.nextDouble();

            SumSueldos += sueldos;

            if (sueldos>1000){
                Mayor1000++;
            }


        }

        System.out.println("La suma de los sueldos fue de: "+SumSueldos);
        System.out.println("La cantidad de sueldos mayores a 1000 fueron: "+Mayor1000);

    }
}
