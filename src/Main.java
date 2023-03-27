import java.util.Random;

public class Main extends QuickSort{
    public static void main(String[] args) {


        Random rand = new Random();
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(100);
        }

        quickSort(array, 0, array.length - 1);


        for(int i : array)
            System.out.println(i);
    }
}