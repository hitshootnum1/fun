package algorithm.sorting;

import java.util.Arrays;

/**
 * Created by duc on 2/11/17.
 */
public class MergeSort extends SortingAlgorithm {
    @Override
    public int [] sort(int[] input) {
        inputArray = mergeSort(input);
        return inputArray;
    }

    private int[] mergeSort(int[] input) {
        int size = input.length;
        if(size == 0 || size == 1)
            return input;

        int [] leftArray = Arrays.copyOfRange(input, 0, size/2);
        int [] rightArray = Arrays.copyOfRange(input, size/2, size);

        int [] leftSortedArray = mergeSort(leftArray);
        int [] rightSortedArray = mergeSort(rightArray);

        return merge(leftSortedArray, rightSortedArray);
    }

    int[] merge(int[] leftSortedArray, int[] rightSortedArray) {
        int [] mergedArray = new int [leftSortedArray.length + rightSortedArray.length];
        int size = mergedArray.length;

        int leftIndex = 0;
        int leftMaxIndex = leftSortedArray.length - 1;
        int rightIndex = 0;
        int rightMaxIndex = rightSortedArray.length - 1;

        int i = 0;

        // merge the common part from two array
        while((rightIndex <= rightMaxIndex) && (leftIndex <= leftMaxIndex)){
            if(leftSortedArray[leftIndex] > rightSortedArray[rightIndex]) {
                mergedArray[i] = rightSortedArray[rightIndex];
                rightIndex++;
            } else {
                mergedArray[i] = leftSortedArray[leftIndex];
                leftIndex++;
            }

            i++;
        }

        // merge the remaining part from left
        while(leftIndex <= leftMaxIndex){
            mergedArray[i] = leftSortedArray[leftIndex];
            leftIndex++;
            i++;
        }

        // merge the remaining part from left
        while(rightIndex <= rightMaxIndex){
            mergedArray[i] = rightSortedArray[rightIndex];
            rightIndex++;
            i++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int [] x = new int [] {4, 3, 2, 1};
        SortingAlgorithm mergeSort = new MergeSort();
        mergeSort.sort(x);
        mergeSort.printOut();
    }
}
