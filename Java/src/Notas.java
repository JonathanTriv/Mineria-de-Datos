import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float participacion,parcial1,parcial2,parcialfin,notasfinal;
        int notaredondeada;

        System.out.println("Digite la nota de participacion: ");
        participacion =entrada.nextFloat();
        System.out.println("Nota de parcial 1: ");
        parcial1 = entrada.nextFloat();;
        System.out.println("Nota de parcial 2: ");
        parcial2 = entrada.nextFloat();
        System.out.println("Nota parcial final: ");
        parcialfin = entrada.nextFloat();

        notasfinal = (participacion * 0.10f) + (parcial1 * 0.25f) + (parcial2 * 0.25f) + (parcialfin * 0.40f);
        notaredondeada = Math.round(notasfinal);

        System.out.println("La nota final del estudiantes es :"+notasfinal+"\nRedondeada: "+notaredondeada);


    }
}
