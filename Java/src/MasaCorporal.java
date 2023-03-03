import java.util.Scanner;

public class MasaCorporal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso,altura,masaCorporal;


        System.out.println("Digita tu altura en metros(m): ");
        altura = entrada.nextDouble();
        while (altura > 2.10 || altura < 1.4){
                System.out.println("Digita una altura valida: ");
                altura = entrada.nextDouble();
        }

        System.out.println("Digita tu peso en kilogramos: ");
        peso = entrada.nextDouble();
        while (peso < 20 || peso > 180) {
                System.out.println("Digita un peso valido: ");
                peso = entrada.nextDouble();
        }
            masaCorporal = peso/ Math.pow(altura,2);

        System.out.println("Masa \t Diagnostico");
        System.out.println("-16 \t Ingreso hospital");
        System.out.println("16-17 \t Bajo peso");
        System.out.println("18-25 \t Peso normal");
        System.out.println("20-30 \t Sobrepeso");
        System.out.println("30-35 \t Sobrepeso cronico");
        System.out.println("35-40 \t Obsesidad");
        System.out.println("+40 \t Obesidad morbida");

        if (masaCorporal < 16) {
            System.out.println("Tu diagnostico es Ingreso hospital debido a que tu masa corporal es: "+masaCorporal);
        }else if (masaCorporal >=16 && masaCorporal <=17){
            System.out.println("Tu diagnostico es Bajo peso debido a que tu masa corporal es: "+masaCorporal);
        }else if (masaCorporal >=18 && masaCorporal <=25){
            System.out.println("Tu diagnostico es Peso normal debido a que tu masa corporal es: "+masaCorporal);
        }else if (masaCorporal >=20 && masaCorporal <=30){
            System.out.println("Tu diagnostico es Sobrepeso debido a que tu masa corporal es: "+masaCorporal);
        }else if (masaCorporal >=30 && masaCorporal <=35){
            System.out.println("Tu diagnostico es Sobrepeso cronico debido a que tu masa corporal es: "+masaCorporal);
        }else if (masaCorporal >=35 && masaCorporal <=40){
            System.out.println("Tu diagnostico es Obesidad debido a que tu masa corporal es: "+masaCorporal);
        }else {
            System.out.println("Tu diagnostico es Obesidad morbida debido a que tu masa corporal es: "+masaCorporal);

        }


    }
}
