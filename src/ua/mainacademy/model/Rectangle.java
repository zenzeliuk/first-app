package ua.mainacademy.model;

public class Rectangle extends Square{
    private double sideB;

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return getSideA() * sideB;
    }
}
