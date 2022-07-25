package com.epam.rd.autotasks;

/*For a positive integer n calculate the result value,
   which is equal to the amount of the “1” in the binary representation of n.*/
class LoopStatements {
    public static int task2(int n) {
        if (n <= 0) throw new IllegalArgumentException();
        int number = Integer.parseInt(Integer.toBinaryString(n));
        int result = 0;
        int digit;
        while (number != 0) {
            digit = number % 10;
            number /= 10;
            if (digit == 1) {
                result = result + digit;
            }
        }
        return result;
    }
}
