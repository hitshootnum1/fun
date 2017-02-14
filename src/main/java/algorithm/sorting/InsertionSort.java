package algorithm.sorting;

/**
 * Created by duc on 2/11/17.
 */
public class InsertionSort extends SortingAlgorithm {

    @Override
    public int [] sort(int[] input) {
        inputArray = input;
        int size = inputArray.length;

        for(int i = 1; i < size; i++){
            sortSubListBackward(i);
            printOut();
        }

        return inputArray;
    }

    private void sortSubListBackward(int i) {
        int currentElement = inputArray[i];

        for(int j = i - 1; j >= 0; j--){
            if(currentElement > inputArray[j]){
                // shift elements from j to i - 1 to right, made one space for currentElement will be inserted
                shiftElementsToRightOneUnit(j + 1, i - 1);

                // insert current element into the first position which smaller than current element
                inputArray[j + 1] = currentElement;

                return;
            }
        }

        // if there is no shifting above. Then currentElement is the smallest. So shift whole sub array
        shiftElementsToRightOneUnit(0, i - 1);
        inputArray[0] = currentElement;
    }

    private void shiftElementsToRightOneUnit(int begin, int end) {
        for (int i = end; i >= begin; i--){
            inputArray[i + 1] = inputArray[i];
        }
    }

    public static void main(String[] args) {
        SortingAlgorithm sortingAlgorithm = new InsertionSort();
        sortingAlgorithm.sort(new int[] {9, 8, 7, 3, 2, 1, 6, 5, 4});
        sortingAlgorithm.printOut();
    }
}
