public class MergeSort {


    public static void mergeSort(int[] array){

        if(array.length < 2)
            return;

        int midIndex = array.length / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[array.length - midIndex];

        for(int i = 0; i < midIndex; i ++){
            leftHalf[i] = array[i];

        }

        for(int i = midIndex; i < array.length; i++){
            rightHalf[i-midIndex] = array[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(array, leftHalf, rightHalf);

    }

    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {

        int i =0, j=0, k=0;

        while(i < leftHalf.length && j < rightHalf.length){

            if(leftHalf[i] < rightHalf[j]){
                array[k] = leftHalf[i];
                i++;


            }else{
                array[k] = rightHalf[j];
                j++;
            }

            k++;

        }

        while(i < leftHalf.length){
            array[k] = leftHalf[i];
            i++;
            k++;

        }

        while(j < rightHalf.length){
            array[k] = rightHalf[j];
            j++;
            k++;

        }

    }
}
