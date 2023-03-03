import java.util.Scanner;

public class EstudiantesMedidas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad,CantMayor18=0,CantMayor175=0,estudiantes=5,sumEdad=0;
        double altura,AlturaMedia,EdadMedia,sumAltura=0;

        for (int i=1;i<=estudiantes;i++){
            System.out.println("Estudinete: "+i);

            System.out.println("Digita tu edad: ");
            edad = entrada.nextInt();
            System.out.println("Digita tu altura en metros: ");
            altura = entrada.nextDouble();
            sumEdad+=edad;
            sumAltura+=altura;

            if (edad>18) {
                CantMayor18++;
            }
            if (altura>1.75){
                CantMayor175++;
            }

        }
            AlturaMedia = sumAltura / estudiantes;
            EdadMedia = sumEdad / estudiantes;

        System.out.println("La altura media de los estudiantes es: "+AlturaMedia+" metros");
        System.out.println("La edad media de los estudiantes es: "+EdadMedia+" años");
        System.out.println("Estudiantes mayores de 18 años: "+CantMayor18);
        System.out.println("Estudiantes con altura mayor a 1.75 metros: "+CantMayor175);

    }
}
