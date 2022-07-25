package com.epam.rd.autotasks;

class LoopStatements {
    public static int task3(int n) {
        if (n < 0) throw new IllegalArgumentException();
        if (n == 0) {return  0;}
//        int c;
//        int a = 0;
//        int b = 1;
//        int result = a + b;
//        for (int i = 1; i < n - 1; i++) {
//            c = a + b;
//            a = b;
//            b = c;
//            result += b;
//        }
//        return result;

        int[] result = new int[n];
        result[0] = 0;
        result[1] = 1;
        int sum = result[0] + result[1];
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
            sum = sum + result[i];
        }
        return sum;
    }
}
