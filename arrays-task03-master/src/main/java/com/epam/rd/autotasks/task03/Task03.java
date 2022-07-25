package com.epam.rd.autotasks.task03;

import java.util.Arrays;

public class Task03 {

    public static void transformMatrix(int[][] matrix) {
        if (matrix != null && matrix.length != 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (j < i) matrix[i][j] = 0;
                    if (j > i) matrix[i][j] = 1;
                }
            }
        } else {matrix = new int[][]{null, null}; throw new IllegalArgumentException();}
    }


    public static void main(String[] args) {
        {
            int[][] matrix = null;
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {{}};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {{}, {}};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {{2, 3}, {4, 5, 6}};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {{2, 3}, {4, 5}, {}};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {{2, 3}, {4, 5}};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {{2, 4, 3, 3}, {5, 7, 8, 5}, {2, 4, 3, 3}, {5, 7, 8, 5}};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {

            int[][] matrix = {{2, 3}, {4, 5}, {6, 7}};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {{2, 4, 3, 3}, {5, 7, 8, 5}, {2, 4, 3, 3}};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }

    }

}
