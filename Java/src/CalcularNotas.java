import java.util.Scanner;

public class CalcularNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double corte1,corte2,corte3,notasfinal;
        int estudiantes;

        System.out.println("Cuntos estudaintes desean conocer su nota : ");
        estudiantes = entrada.nextInt();

        for (int i = 1;i<=estudiantes;i++) {
            System.out.println("Estidiantes: "+i);
            System.out.println("Digite la nota del primer corte: ");
            corte1 = entrada.nextDouble();
            while (corte1 < 0 || corte1 > 5) {
                    System.out.println("La nota del primer corte no es valida, digita una nota de 0 a 5");
                    corte1 = entrada.nextDouble();
            }
            System.out.println("Digite la nota del segundo corte: ");
            corte2 = entrada.nextDouble();
            while (corte2 < 0 || corte2 > 5) {
                    System.out.println("La nota del sedundo corte no es valida, digita una nota de 0 a 5");
                    corte2 = entrada.nextDouble();
            }

            System.out.println("Digite la nota del tercer corte: ");
            corte3 = entrada.nextDouble();
            while (corte3 < 0 || corte3 > 5) {
                    System.out.println("La nota del tercer corte no es valida, digita una nota de 0 a 5");
                    corte3 = entrada.nextDouble();
            }
            notasfinal = (corte1 * 0.45) + (corte2 * 0.35) + (corte3 * 0.35);
            if (notasfinal >= 0 && notasfinal <= 2.9) {
                System.out.println("Tu rendimiento fue Insuficiente ya que tu nota es: " + notasfinal);
            } else if (notasfinal >= 3 && notasfinal <= 4) {
                System.out.println("Tu rendimiento fue Promedio ya que tu nota es: " + notasfinal);
            } else {
                System.out.println("Tu rendimiento fue Sobresaliente ya que tu nota es: " + notasfinal);
            }
        }
    }
}
