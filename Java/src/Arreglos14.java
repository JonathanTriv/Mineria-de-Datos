import java.util.Scanner;

public class Arreglos14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float[] Primero = {3,2,4,3,4};
        float[] Segundo = {5,5,5,5,5};
        float[] Tercero = {4,2,3,2,4};

        float media1=0,media2=0,media3=0,mediaEstudiante=0;
        int estudiante;

        System.out.println("Digite alumno a obtener la media: ");
        estudiante = entrada.nextInt();

        for (int i=0;i<5;i++){
            media1+=Primero[i];
            media2+=Segundo[i];
            media3+=Tercero[i];
            mediaEstudiante = Primero[estudiante-1] + Segundo[estudiante-1] +Tercero[estudiante-1];

        }
        media1 = media1 /5;
        media2 = media2 /5;
        media3 = media3 /5;
        mediaEstudiante = mediaEstudiante / 3;
        System.out.println("La media del grado en el primer trimestre fue: "+media1);
        System.out.println("La media del grado en el segundo trimestre fue: "+media2);
        System.out.println("La media del grado en el tercer trimestre fue: "+media3);

        System.out.println("La media de los trimestres del estudiante "+estudiante+" fue: "+mediaEstudiante);

    }
}
