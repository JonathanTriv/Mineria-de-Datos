import java.util.Scanner;

public class Main {
    static Scanner Captura = new Scanner(System.in);
    public static void main(String[] args) {

        int Mouse, Teclado, Monitor, Ram, Disco_Duro;
        Mouse = 45000;
        Teclado = 60000;
        Monitor = 950000;
        Ram = 150000;
        Disco_Duro = 280000;

        int num = 0;
        System.out.println("Bienvenido a  la Tienda TEC");
        System.out.println("Digita tus datos por favor");
        Datos();
        while (num !=6 && num !=7){

            System.out.println("Que te gustatia adquirir");
            System.out.println("1. Mouse");
            System.out.println("2. Teclado");
            System.out.println("3. Monitor");
            System.out.println("4. Ram");
            System.out.println("5. Disco Duro");
            System.out.println("6. Generar Factura");
            System.out.println("7. Salir");

            System.out.println("Digita una opcion: ");
            num = Captura.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Cuantos quieres adquirir: ");
                    int Cant_mouse = Captura.nextInt();
                    break;
                case 2:
                    System.out.println("Cuantos quieres adquirir: ");
                    int Cant_teclado = Captura.nextInt();
                    break;
                case 3:
                    System.out.println("Cuantos quieres adquirir: ");
                    int Cant_monitor = Captura.nextInt();
                    break;
                case 4:
                    System.out.println("Cuantos quieres adquirir: ");
                    int Cant_ram = Captura.nextInt();
                    break;
                case 5:
                    System.out.println("Cuantos quieres adquirir: ");
                    int Cant_disco = Captura.nextInt();
                    break;
                case 6:
                    String Factura[][] = {
                            {"Producto","Cantidad", "Precio Unidad","Valor Total"},
                    };
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
    static void Datos(){

        System.out.println("Nombre");
        String Nombre = Captura.next();
        System.out.println("Direccion");
        String Direccion = Captura.next();
        System.out.println("Correo Electronico");
        String Correo = Captura.next();
    }

}