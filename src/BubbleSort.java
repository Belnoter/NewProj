public class BubbleSort {

    public static void bubbleSort(int[] array){

        boolean needSwap = true;

        while(needSwap){

            needSwap = false;
            for(int i = 0; i <array.length - 1; i++){
                if(array[i] > array[i+1]){
                    needSwap = true;
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;

                }
            }


        }


    }
}
