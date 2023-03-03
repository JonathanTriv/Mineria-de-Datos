import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numeros = 10,num,sumneg=0,sumpos=0,ceros=0,mediapos,medianeg;

        for (int i =1;i<=numeros;i++){
            System.out.println("Digita un numero: ");
            num = entrada.nextDouble();

            if (num <0){
                sumneg+=num;
            } else if (num>0) {
                sumpos+=num;
            }else {
                ceros++;
            }
        }
        medianeg = sumneg / numeros;
        mediapos = sumpos / numeros;

        System.out.println("La media de los posistivos es: "+mediapos);
        System.out.println("La emdia de los negativos es: "+medianeg);
        System.out.println("La cantidad de ceros es: "+ceros);


    }
}
