package com.epam.rd.autotasks;

public class FunctionsTask3 {
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int multiArithmeticElements(int a1, int t, int n) {
        if ( n <= 0) throw new IllegalArgumentException();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * a1;
            a1 = a1 + t;
        }
        return result;
    }
}
