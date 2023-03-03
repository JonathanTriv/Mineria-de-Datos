import java.util.Random;
import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();


        double CantLitros=0,PrecioLitro=0,CanPrecio=0,TotalLitros=0,TotalPrecio=0,Facturacion=0;
        int codigo=0,Cont=5,Mas600=0;

            for (int i=1;i<=Cont;i++) {


                System.out.println("Factura N°"+i);
                System.out.println("Digite el codigo del artuculo: ");
                codigo = entrada.nextInt();
                while (codigo < 1 || codigo > 3){
                    System.out.println("Ese codigo no existe ");
                    System.out.println("Digita un codigo del 1 al 3: ");
                    codigo = entrada.nextInt();
                }
                System.out.println("Digite la cantidad de litros: ");
                CantLitros = entrada.nextDouble();
                switch (codigo){
                    case 1:
                        PrecioLitro = 0.6;
                        break;
                    case 2:
                        PrecioLitro = 2;
                        break;
                    case 3:
                        PrecioLitro = 1.25;
                        break;
                }
                CanPrecio = CantLitros * PrecioLitro;
                Facturacion += CanPrecio;
                if (codigo == 1) {
                    TotalLitros += CantLitros;
                }
                if (CanPrecio > 600) {
                     Mas600++;
                }

                System.out.println("Codigo \t  Litros \t Precio Litro");
                System.out.println(codigo + "\t\t\t" + CantLitros + "\t\t\t" + PrecioLitro);



            }

            System.out.println("Precio: " + Facturacion);
            if (TotalLitros != 0){
                System.out.println("Cantidad Litros: " + TotalLitros);
            }else {
                System.out.println("No se ingresaron productos con el codigo 1");
            }
            if (Mas600 != 0){
                System.out.println("Cantidad de falturas por mas de $600: "+Mas600);
            }else {
                System.out.println("No hubieron facturas por mas de $600");
            }





    }
}
