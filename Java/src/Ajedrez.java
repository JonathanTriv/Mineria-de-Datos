
import java.util.Random;
public class Ajedrez {
        public static void main(String[] args) {
            Random aleatorio = new Random();

            int j1,j2,tolj1=0,tolj2=0,turnos=0,dama=0,torre=0,alfil=0,caballo=0,peon=0,dama2=0,torre2=0,alfil2=0,caballo2=0,peon2=0;
            int vald=9,valt=5,vala=3,valc=2,valp=1,t1=0,t2=0,t3=0,t4=0,t5=0,t12=0,t22=0,t32=0,t42=0,t52=0,cont=0,cont2=0;
            do {
                turnos++;
                System.out.println("Turno: "+turnos);
                System.out.println("");

                System.out.print("Jugador 1: ");
                j1 = aleatorio.nextInt(5)+1;
                if (j1 == 5 && dama < 1){
                    System.out.println("Dama");
                    dama++;
                    tolj1+=vald;
                    cont = vald;
                }else if (j1 == 4 && torre < 2){
                    System.out.println("Torre");
                    torre++;
                    tolj1+=valt;
                    cont = valt;
                } else if (j1 == 3 && alfil < 2){
                    System.out.println("Alfil");
                    alfil++;
                    tolj1+=vala;
                    cont = vala;
                } else if (j1 == 2 && caballo < 2) {
                    System.out.println("Caballo");
                    caballo++;
                    tolj1+=valc;
                    cont = valc;
                }else if (j1 == 2 &&  peon < 8){
                    System.out.println("Peon");
                    peon++;
                    tolj1+=valp;
                    cont = valp;
                }else {
                    tolj1+=0;
                    cont = 0;
                    System.out.println("Pierde turno");
                }





                System.out.print("Jugador 2: ");

                j2 = aleatorio.nextInt(5) + 1;
                if (j2 == 5 && dama2 < 1){
                    System.out.println("Dama");
                    dama2++;
                    tolj2+=vald;
                    cont2 = vald;
                }else if (j2 == 4 &&  torre2 < 2){
                    System.out.println("Torre");
                    torre2++;
                    tolj2+=valt;
                    cont2 = valt;
                } else if (j2 == 3 &&  alfil2 < 2){
                    System.out.println("Alfil");
                    alfil2++;
                    tolj2+=vala;
                    cont2 = vala;
                } else if (j2 == 2 &&  caballo2 < 2) {
                    System.out.println("Caballo");
                    caballo2++;
                    tolj2+=valc;
                    cont2 = valc;
                }else if (j2 == 2 &&  peon2 < 8){
                    System.out.println("Peon");
                    peon2++;
                    tolj2+=valp;
                    cont2 = valp;
                }else {
                    tolj2+=0;
                    cont2 = 0;
                    System.out.println("Pierde turno");

                }

                if (turnos == 1){
                    t1 = cont;
                    t12 = cont2;
                } else if (turnos == 2 ) {
                    t2 = cont;
                    t22 = cont2;
                } else if (turnos == 3) {
                    t3 = cont;
                    t32 = cont2;
                } else if (turnos == 4) {
                    t4 = cont;
                    t42 = cont2;
                } else if (turnos == 5){
                    t5 = cont;
                    t52 = cont2;
                }
                System.out.println("");

            }while (turnos < 5);


            if (tolj1 > tolj2){
                System.out.println(" Turno 1: "+t1+ "\n Turno 2: "+t2+ "\n Turno 3: "+t3+"\n Turno 4: "+t4+"\n Turno 5: "+t5);
                System.out.println("Jugador 1 Ganador con un puntaje de: "+tolj1);
            } else if (tolj2 > tolj1) {
                System.out.println(" Turno 1: "+t12+ "\n Turno 2: "+t22+ "\n Turno 3: "+t32+"\n Turno 4: "+t42+"\n Turno 5: "+t52);
                System.out.println("Jugador 2 Ganador con un puntaje de: "+tolj2);
            }else {
                System.out.println("Empate con un puntaje de: "+tolj1);
            }


        }
    }

