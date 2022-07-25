package com.epam.rd.autotasks.task02;

public class Task02 {

    public static int maximumDistance(int[] array) {
        if (array != null) {
            if (array.length > 0) {
                int maxValue = array[0];
                int maxValueArrayIndex = 0;
                for (int index = 0; index < array.length; index++) {
                    if (array[index] > maxValue) {
                        maxValue = array[index];
                        maxValueArrayIndex = index;
                    }
                }
                int maxDist = 0;
                for (int i = maxValueArrayIndex; i < array.length; i++) {
                    int firstOccurrenceElementArray = -1;
                    int lastOccurrenceElementArray = -1;

                    for (int j = maxValueArrayIndex; j < array.length; j++) {
                        if (array[i] == array[j]) {
                            if (firstOccurrenceElementArray == -1)
                                firstOccurrenceElementArray = lastOccurrenceElementArray = j;
                            else
                                lastOccurrenceElementArray = j;
                        }
                    }
                    if (lastOccurrenceElementArray - firstOccurrenceElementArray > maxDist)
                        maxDist = lastOccurrenceElementArray - firstOccurrenceElementArray;
                }
                return maxDist;
            } else return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        {
            int[] array = null;
            System.out.println("result = " + maximumDistance(array));
        }
        {
            int[] array = new int[]{};
            System.out.println("result = " + maximumDistance(array));
        }
        {
            int[] array = new int[]{4, 100, 3, 4};
            System.out.println("result = " + maximumDistance(array));
        }
        {
            int[] array = new int[]{5, 50, 50, 4, 5};
            System.out.println("result = " + maximumDistance(array));
        }
        {
            int[] array = new int[]{5, 350, 350, 4, 350};
            System.out.println("result = " + maximumDistance(array));
        }
        {
            int[] array = new int[]{10, 10, 10, 10, 10};
            System.out.println("result = " + maximumDistance(array));
        }
    }

}
