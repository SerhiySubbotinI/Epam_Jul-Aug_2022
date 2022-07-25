package com.epam.rd.qa.classes;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double a, double b) {
        if (a <= 0 | b <= 0) throw new IllegalArgumentException();
        sideA = a;
        sideB = b;
    }

    public Rectangle(double side) {
        if (side <= 0) throw new IllegalArgumentException();
        sideA = sideB = side;
    }

    public Rectangle() {
        this(4, 3);
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double area() {
        return getSideA() * getSideB();
    }

    public double perimeter() {
        return 2 * (getSideA() + getSideB());
    }

    public boolean isSquare() {
        return (Double.compare(getSideA(), getSideB()) == 0);
    }

    public void replaceSides() {
        double temp = sideA;
        sideA = sideB;
        sideB = temp;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //    @Override
//    public int hashCode() {
//        return Objects.hash(getSideA(), getSideB());
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.getSideA(), getSideB()) == 0 && Double.compare(rectangle.getSideB(), getSideA()) == 0;
    }

    @Override
    public String toString() {
        return "Rectungle{sideA = " + sideA + ", sideB =" + sideB + "}";
    }
}
