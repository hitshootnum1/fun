package algorithm.sorting;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by duc on 2/11/17.
 */
public class MergeSortTest {

    @Test
    public void merge(){
        MergeSort sort = new MergeSort();
        int [] leftArr = new int [] {1, 3, 5, 7, 8, 9};
        int [] rightArr = new int [] {2, 4, 6, 10, 11, 12};

        int result [] = sort.merge(leftArr, rightArr);

        int expected [] = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        assertThat(result, is(expected));
    }

    @Test
    public void merge1(){
        MergeSort sort = new MergeSort();
        int [] leftArr = new int [] {1, 3, 5};
        int [] rightArr = new int [] {2, 4, 6, 10, 11, 12};

        int result [] = sort.merge(leftArr, rightArr);

        int expected [] = new int [] {1, 2, 3, 4, 5, 6, 10, 11, 12};
        assertThat(result, is(expected));
    }

    @Test
    public void mergeSort() throws Exception {
        MergeSort mergeSort = new MergeSort();
        BubbleSort bubbleSort = new BubbleSort();

        int[] randomInput = new int[100];
        for(int i = 0; i < randomInput.length; i++) {
            randomInput[i] = (int)(Math.random());
        }

        int[] bubbleOutput = bubbleSort.sort(randomInput);
        assertThat(bubbleOutput, is(mergeSort.sort(randomInput)));
    }
}