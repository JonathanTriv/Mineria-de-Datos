import java.util.Scanner;

public class Dolares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float Guillermodol,Luisdol,Juandol,Totaldol;

        System.out.println("Dolares de Guillermo: ");
        Guillermodol = entrada.nextFloat();

        Luisdol = Guillermodol / 2;
        Juandol = (Luisdol + Guillermodol) /2;
        Totaldol = Guillermodol +Luisdol + Juandol;

        System.out.println("Dolares Luis: "+Luisdol);
        System.out.println("Dolares Juan: "+Juandol);
        System.out.println("Dolares entre los tres: "+Totaldol);

    }
}
