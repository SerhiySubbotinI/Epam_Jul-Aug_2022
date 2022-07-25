package com.epam.rd.autotasks;


public class FunctionsTask2 {
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static boolean isSorted(int[] array, SortOrder order) {
        if (array == null || array.length == 0) throw new IllegalArgumentException();
        for (int i = 1; i < array.length; i++)
            if ((array[i] < array[i - 1] && order == SortOrder.ASC) || (array[i] > array[i - 1] && order == SortOrder.DESC))
                return false;
        return true;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int[] transform(int[] array, SortOrder order) {
        if (array == null || array.length == 0) throw new IllegalArgumentException();
        int i = 0;
        if (isSorted(array,order)) {
            while (i < array.length) {
                int temp = array[i];
                array[i] = temp + i;
                i++;
            }
        }else return array;
        return array;
    }
}
