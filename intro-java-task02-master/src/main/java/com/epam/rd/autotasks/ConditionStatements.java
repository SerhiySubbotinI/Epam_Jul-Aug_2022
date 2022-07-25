package com.epam.rd.autotasks;

class ConditionStatements {

    public static int task2(int n) {
        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;
        int max;
        int middle;
        int min;
        //max
        if (a >= b && a >= c)
            max = a;
        else if (b >= a && b >= c)
            max = b;
        else
            max = c;
        //middle
        if (a > b) {
            if (b > c)
                middle = b;
            else if (a > c)
                middle = c;
            else
                middle = a;
        } else {
            if (a > c)
                middle = a;
            else if (b > c)
                middle = c;
            else middle = b;}
        //max
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= c && b <= a) {
            min = b;
        } else {
            min = c;
        }
        String str = max + "" + middle + "" + min;
        return Integer.parseInt(str);
    }
}

