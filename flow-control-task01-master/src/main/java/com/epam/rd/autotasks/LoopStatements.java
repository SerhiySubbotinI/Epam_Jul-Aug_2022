package com.epam.rd.autotasks;
/*For a positive integer n calculate the result value,
   which is equal to the sum of the odd numbers of n.*/
class LoopStatements {
    public static int task1(int n) {
        if (n <= 0) throw new IllegalArgumentException();
        int digit;
        int oddSum = 0;
        while (n != 0) {
            digit = n % 10;
            n /= 10;
            if (digit % 2 != 0) {
                oddSum = oddSum + digit;
            }
        }
        return oddSum;
    }


}
