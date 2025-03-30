package edu.maksimchuk;

/**
 @author Tom
 @project lab2
 @class Rhombus
 @version 1.0.0
 @since 30.03.2025 - 19.39
 */
public class Rhombus {
    private double diagonal1;
    private double diagonal2;

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double calculateArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    public double calculatePerimeter() {
        double side = Math.sqrt(Math.pow(diagonal1 / 2, 2) + Math.pow(diagonal2 / 2, 2));
        return 4 * side;
    }

    public boolean isSquare() {
        return diagonal1 == diagonal2;
    }

    public void setDiagonals(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }
}

