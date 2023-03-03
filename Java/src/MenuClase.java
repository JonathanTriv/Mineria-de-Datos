import java.util.Scanner;

public class MenuClase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc,estudiantes;
        double peso,altura,masaCorporal,corte1,corte2,corte3,notasfinal;

        System.out.println("Bienvenido");
        do {
            System.out.println("----------------------------------------------------------------");
            System.out.println("1. Masa Corporal");
            System.out.println("2. Calcular Notas");
            System.out.println("3. Salir");

            System.out.println("Ingresa una Opcion : ");
            opc = entrada.nextInt();



        switch (opc){
            case 1:
                System.out.println("Digita tu altura en metros: ");
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
                break;
            case 2:
                System.out.println("Cuntos estudaintes desean conocer su nota: ");
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
                break;
            case 3:
                System.out.println("Saliste con exito");
                System.exit(0);
            default:
                System.out.println("Error ingresa una opcion validad");

        }

        }while (opc >= 1 || opc <= 3);
    }
}
