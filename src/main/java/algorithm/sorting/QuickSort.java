package algorithm.sorting;

/**
 * Created by duc on 2/11/17.
 */
public class QuickSort extends SortingAlgorithm {
    @Override
    public int[] sort(int[] input) {
        inputArray = input;

        quickSort(0, input.length - 1);

        return inputArray;
    }

    void quickSort(int start, int end) {
        if (start < end) {
            int splitPoint = partition(start, end);
            quickSort(start, splitPoint);
            quickSort(splitPoint + 1, end);
        }
    }

    int partition(int start, int end) {

        int pivot = inputArray[start];
        int leftIndex = start + 1;
        int rightIndex = end;

        while(leftIndex < rightIndex) {
            // if left side > pivot and right sight > pivot, they should be swapped
            if (inputArray[leftIndex] > pivot && inputArray[rightIndex] < pivot) {
                swap(leftIndex, rightIndex);
            }

            // if left side < pivot, satisfy the clause, increase leftIndex to move to the next position
            while (inputArray[leftIndex] < pivot && leftIndex < end) {
                leftIndex++;
            }

            // if right side > pivot, satisfy the clause, increase right Index to move to the prev position
            while (inputArray[rightIndex] > pivot && rightIndex > start) {
                rightIndex--;
            }
        }
//        if(leftIndex >= rightIndex) leftIndex--;
        int minIndex = leftIndex < rightIndex ? leftIndex : rightIndex;
        swap(start, minIndex);

        // swap pivot with the most right index.
//        if(leftIndex != end && leftIndex != start + 1)
//            swap(start, --leftIndex);
//        else if(leftIndex >= rightIndex)
//            swap(start, --leftIndex);
//        else
//            swap(start, leftIndex);

        return minIndex;
    }
}
