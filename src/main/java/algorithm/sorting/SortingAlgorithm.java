package algorithm.sorting;

/**
 * Created by duc on 2/11/17.
 */
public abstract class SortingAlgorithm {
    protected int [] inputArray;

    public static void printOut(int [] inputArray){
        for(int i = 0; i < inputArray.length; i++){
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    public void printOut(){
        printOut(inputArray);
    }

    protected void swap(int i, int j) {
        int temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }

    public abstract int [] sort(int [] input);
}
