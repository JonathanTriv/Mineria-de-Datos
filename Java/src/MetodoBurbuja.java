public class MetodoBurbuja {
    public static void main(String[] args) {

        int[] num1 = {1,45,3,67,4,34,12};
        int ant=0;



        for (int i=0;i<(num1.length-1);i++){
            for (int j=0;j<(num1.length-1);j++){
                if (num1[j] > num1[j+1]){
                    ant = num1[j];
                    num1[j] = num1[j+1];
                    num1[j+1] = ant;
                }

            }
        }
        System.out.println("Ordenado");
        for (int i=0;i<num1.length;i++) {
            System.out.println(num1[i]);
        }
    }
}
