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
            quickSort(start, splitPoint - 1);
            quickSort(splitPoint + 1, end);
        }
    }

    int partition(int start, int end) {

        int pivot = inputArray[start];
        int leftIndex = start + 1;
        int rightIndex = end;

        while(true) {
            // if left side < pivot, satisfy the clause, increase leftIndex to move to the next position
            while (leftIndex <= rightIndex && inputArray[leftIndex] <= pivot) {
                leftIndex++;
            }

            // if right side > pivot, satisfy the clause, increase right Index to move to the prev position
            while (rightIndex >= leftIndex && inputArray[rightIndex] >= pivot) {
                rightIndex--;
            }

            // if left side > pivot and right sight > pivot, they should be swapped
            if (rightIndex < leftIndex) {
                break;
            } else {
                swap(leftIndex, rightIndex);
            }
        }

        swap(start, rightIndex);
        return rightIndex;
    }
}
