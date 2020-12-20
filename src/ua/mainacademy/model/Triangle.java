package ua.mainacademy.model;

public class Triangle implements Shape{
    private double side_A;
    private double side_H_a;

    public double getSide_A() {
        return side_A;
    }

    public void setSide_A(double side_A) {
        this.side_A = side_A;
    }

    public double getSide_H_a() {
        return side_H_a;
    }

    public void setSide_H_a(double side_H_a) {
        this.side_H_a = side_H_a;
    }

    @Override
    public double getArea() {
        return (side_A * side_H_a) / 2;
    }
}
