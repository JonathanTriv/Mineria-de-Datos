public class OrdenamientoPorInsercion {
    public static void main(String[] args) {

        int[] array = {1,6,23,56,45,89,12,0,55,34};
        int pos=0,ant=0;


        for (int i = 0;i<array.length;i++){
            pos = i;
            ant = array[i];

            while ((pos>0) && (array[pos-1] > ant)){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = ant;
        }
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
