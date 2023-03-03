import java.util.Random;
import java.util.Scanner;

public class tiendaDescuento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        float compra, descuento;

        compra = aleatorio.nextFloat(310);
        System.out.println("El valor de la compra fue: "+compra);

        if (compra >= 300) {
            descuento = compra * 0.20f;
            compra -= descuento;
            System.out.println("La compra con su descueto es: "+compra);
        }else {
            System.out.println("Su compra no tiende descuneto");
        }



    }
}
