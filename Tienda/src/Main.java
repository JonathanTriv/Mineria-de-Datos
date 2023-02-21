import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int Mouse, Teclado, Monitor, Ram, Disco_Duro;
        Mouse = 45000;
        Teclado = 60000;
        Monitor = 950000;
        Ram = 150000;
        Disco_Duro = 280000;
        String Nombre, Nit, Direccion, Correo;

        Scanner Captura = new Scanner(System.in);
        System.out.println("Bienvenido a  la Tienda TEC");
        System.out.println("Que te gustatia adquirir");
        System.out.println("1. Mouse");
        System.out.println("2. Teclado");
        System.out.println("3. Monitor");
        System.out.println("4. Ram");
        System.out.println("5. Disco Duro");
        System.out.println("6. Salir");

        System.out.println("Digita una opcion");
        int num = Captura.nextInt();

        switch (num){
            case 1:
                System.out.println("Cuantos te gustaria adquirir");
                int Cantm = Captura.nextInt();
                break;
        }

        String factura [][] ;

        System.out.println("Digita tu Nombre");
        Nombre = Captura.next();
        System.out.println("Digita tu Direccion");
        Direccion = Captura.next();
        System.out.println("Digita tu Correo Electronico");
        Correo = Captura.next();



    }

}