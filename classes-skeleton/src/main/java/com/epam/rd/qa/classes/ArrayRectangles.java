package com.epam.rd.qa.classes;

import java.util.Arrays;

public class ArrayRectangles {
    private final Rectangle[] rectangle_array;

    public ArrayRectangles(int size) {
        if (size <= 0) throw new IllegalArgumentException();
        rectangle_array = new Rectangle[size];
    }

    public ArrayRectangles(Rectangle... rectangles) {
        if (rectangles == null || rectangles.length == 0) throw new IllegalArgumentException();
        {
            for (Rectangle rectangle : rectangles) {
                if (rectangle == null) throw new IllegalArgumentException();
            }
            rectangle_array = Arrays.copyOf(rectangles, rectangles.length);
        }
    }

    public boolean addRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangle_array.length; i++) {
            if (rectangle_array[i] == null) {
                rectangle_array[i] = rectangle;
                return true;
            }
        }
        return false;
    }

    public int size() {
        int ammountElements = 0;
        for (Rectangle rectangle : rectangle_array) {
            if (rectangle != null) {
                ammountElements++;
            }
        }
        return ammountElements;
    }

    public int indexMaxArea() {
        int maxAreaNumber = 0;
        for (int i = 1; i < rectangle_array.length; i++) {
            if (rectangle_array[i] == null) {
                continue;
            }
            double thisRectangleArea = rectangle_array[i].area();
            if (thisRectangleArea > rectangle_array[maxAreaNumber].area()) {
                maxAreaNumber = i;
            }
        }
        return maxAreaNumber;
    }

    public int indexMinPerimeter() {
        int minPerimeterNumber = 0;
        for (int i = 1; i < rectangle_array.length; i++) {
            if (rectangle_array[i] == null) {
                continue;
            }
            double thisRectanglePerimeter = rectangle_array[i].perimeter();
            if (thisRectanglePerimeter < rectangle_array[minPerimeterNumber].perimeter()) {
                minPerimeterNumber = i;
            }
        }
        return minPerimeterNumber;
    }

    public int numberSquares() {
        {
            int numSq = 0;
            for (Rectangle rectangle : rectangle_array) {
                if (rectangle.isSquare()) {
                    numSq++;
                }
            }
            return numSq;
        }
    }
}
