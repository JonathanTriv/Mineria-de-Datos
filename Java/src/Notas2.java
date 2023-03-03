import java.util.Scanner;

public class Notas2 {
    public static void main(String[] args) {
        Scanner entrda = new Scanner(System.in);

        double nota;
        int aprobados=0,condicionados=0,suspensos=0;

        for (int i=1;i<=6;i++){

            System.out.println("Digite la nota del estudiante "+i);
            nota = entrda.nextDouble();
            while (nota < 0 || nota > 10){
                System.out.println("La nota tiene que estan en un rango de 0 a 10: ");
                nota = entrda.nextDouble();
            }

            if (nota < 4){
                suspensos++;
            } else if (nota == 4) {
                condicionados++;
            }else {
                aprobados++;
            }

        }

        System.out.println("La cantidad de almunos aprobados es de: "+aprobados);
        System.out.println("La cantidad de almunos condicnonados es de: "+condicionados);
        System.out.println("La cantidad de almunos suspendos es de: "+suspensos);
    }
}
