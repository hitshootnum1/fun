package algorithm.sorting;

/**
 * Created by duc on 2/11/17.
 */
public class SelectionSort extends SortingAlgorithm {

    @Override
    public int [] sort(int[] input) {
        inputArray = input;
        int size = inputArray.length;

        for(int i = 0; i < size - 1; i++){
            selectMinAndSwap(i);
        }

        return inputArray;
    }

    private void selectMinAndSwap(int i) {
        int size = inputArray.length;
        int minInList = inputArray[i];
        int minIndex = i;

        for(int j = i + 1; j < size; j++){
            if(minInList > inputArray[j]){
                minInList = inputArray[j];
                minIndex = j;
            }
        }

        swap(i, minIndex);
    }

    public static void main(String[] args) {
        SortingAlgorithm sortingAlgorithm = new SelectionSort();
        sortingAlgorithm.sort(new int []{9, 8, 7, 6, 5, 4, 3, 2, 1});
        sortingAlgorithm.printOut();
    }
}
