package info.xiaomo;

import info.xiaomo.sort.SortUtil;
import org.junit.Test;

public class TestSort {

    @Test
    public void testInsertSort() {
        int[] arr = new int[]{13, 6, 3, 31, 9, 27, 5, 11};
        SortUtil.insertSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
