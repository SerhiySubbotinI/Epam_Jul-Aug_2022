package com.epam.rd.autotasks.task01;

import java.util.Arrays;

public class Task01 {

    public static void swapEven(int[] array) {
        if (array != null) {
            if (array.length > 0) {
                for (int i = 0; i < (array.length / 2); i++) {
                    int temp1 = array[i];
                    int temp2 = array[array.length - i - 1];
                    if ((temp1 % 2) == 0 && (temp2 % 2) == 0) {
                        array[i] = temp2;
                        array[array.length - i - 1] = temp1;
                    }
                }
            }
        } else System.out.println(Arrays.toString((int[]) null));
    }

    public static void main(String[] args) {
        {
            int[] array = null;
            swapEven(array);
            System.out.println(Arrays.toString(array));
        }
        {
            int[] array = new int[]{};
            swapEven(array);
            System.out.println(Arrays.toString(array));
        }
        {
            int[] array = new int[]{10, 5, 3, 4};
            swapEven(array);
            System.out.println(Arrays.toString(array));
        }
        {
            int[] array = new int[]{100, 2, 3, 4, 5};
            swapEven(array);
            System.out.println(Arrays.toString(array));
        }
        {
            int[] array = new int[]{100, 2, 3, 45, 33, 8, 4, 54};
            swapEven(array);
            System.out.println(Arrays.toString(array));
        }
    }

}
