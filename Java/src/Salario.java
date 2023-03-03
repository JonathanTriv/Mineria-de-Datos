import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float SalarioSem,SalarioHor;
        int horas,dias,horastol;

        System.out.println("Horas por dia trabajadas: ");
        horas = entrada.nextInt();
        System.out.println("Dias trabajados a la sem: ");
        dias = entrada.nextInt();
        System.out.println("Salario por hora: ");
        SalarioHor = entrada.nextFloat();

        horastol = horas * dias;
        SalarioSem = horastol * SalarioHor;

        System.out.println("Tu salario semanal es: "+SalarioSem);

    }
}
