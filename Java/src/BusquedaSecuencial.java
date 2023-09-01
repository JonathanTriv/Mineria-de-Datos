import java.util.Scanner;

public class BusquedaSecuencial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] num = {1,2,3,4,5,6,7,8,9};
        int dato=0, turno=0;
        boolean encontrado = false;

        do {
            System.out.println("Digita el numero a buscar: ");
            dato = entrada.nextInt();

            int i=0;
            while ((i<num.length) && (encontrado == false)){
                if (num[i] == dato){
                    encontrado = true;
                }
                i++;
            }
            turno++;

            if (encontrado == false){
                System.out.println("El numero "+dato+" no se encuentra en el array ");
            }else {
                System.out.println("El nuemro "+dato+" se encuecntra en el array en la posiscion "+i);
            }
        }while (turno <= 5 && encontrado == false);


    }
}
