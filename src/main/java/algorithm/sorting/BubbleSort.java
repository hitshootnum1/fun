package algorithm.sorting;

/**
 * Created by duc on 2/11/17.
 *
 */
public class BubbleSort extends SortingAlgorithm {

    public int [] sort(int[] input) {
        inputArray = input;

        int size = inputArray.length;
        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - 1; j++){
                if(inputArray[j] > inputArray[j+1]){
                    swap(j, j+1);
                }
            }
        }

        return inputArray;
    }

    public static void main(String[] args) {
        SortingAlgorithm sortingAlgorithm = new BubbleSort();
        sortingAlgorithm.sort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
        sortingAlgorithm.printOut();
    }

}
