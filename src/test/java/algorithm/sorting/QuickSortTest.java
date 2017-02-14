package algorithm.sorting;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by duc on 2/11/17.
 */
public class QuickSortTest {

    @Test
    public void partition() throws Exception {
        QuickSort quickSort = new QuickSort();
        quickSort.inputArray = new int [] {6, 5, 4, 8, 9, 7};
        assertThat(quickSort.partition(0, 5), is(2));
        assertThat(quickSort.inputArray, is(new int []{4, 5, 6, 8, 9, 7}));

    }

    @Test
    public void partition1() throws Exception {
        QuickSort quickSort = new QuickSort();
        quickSort.inputArray = new int [] {4, 3, 2, 1};
        assertThat(quickSort.partition(0, 3), is(3));
        assertThat(quickSort.inputArray, is(new int []{1, 3, 2, 4}));

    }

    @Test
    public void partition2() throws Exception {
        QuickSort quickSort = new QuickSort();
        quickSort.inputArray = new int [] {1, 2, 3, 4};
        assertThat(quickSort.partition(0, 3), is(0));
        assertThat(quickSort.inputArray, is(new int []{1, 2, 3, 4}));

    }

    @Test
    public void partition3() throws Exception {
        QuickSort quickSort = new QuickSort();
        quickSort.inputArray = new int [] {1, 3, 2};
        assertThat(quickSort.partition(0, 2), is(1));
        assertThat(quickSort.inputArray, is(new int []{3, 1, 2}));

    }

    @Test
    public void partition4() throws Exception {
        QuickSort quickSort = new QuickSort();
        quickSort.inputArray = new int [] {3, 1, 2};
        assertThat(quickSort.partition(0, 2), is(2));
        assertThat(quickSort.inputArray, is(new int []{2, 1, 3}));
    }

    @Test
    public void partition5() throws Exception {
        QuickSort quickSort = new QuickSort();
        quickSort.inputArray = new int [] {2, 1, 3};
        assertThat(quickSort.partition(0, 2), is(1));
        assertThat(quickSort.inputArray, is(new int []{1, 2, 3}));
    }

    @Test
    @Ignore
    public void sort() throws Exception {
        QuickSort quickSort = new QuickSort();
        int [] input = new int [] {4, 3, 2, 1};
        int [] output = quickSort.sort(input);
        assertThat(output, is(new int [] {1, 2, 3, 4}));
    }
}