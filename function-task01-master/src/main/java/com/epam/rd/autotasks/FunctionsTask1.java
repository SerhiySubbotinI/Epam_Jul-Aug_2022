package com.epam.rd.autotasks;


class FunctionsTask1 {
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
}
