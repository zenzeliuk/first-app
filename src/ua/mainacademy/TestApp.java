package ua.mainacademy;

import ua.mainacademy.model.Circle;
import ua.mainacademy.model.Square;
import ua.mainacademy.model.Triangle;

public class TestApp {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);

        Square square = new Square();
        square.setSideA(4);

        Triangle triangle = new Triangle();
        triangle.setSide_A(2);
        triangle.setSide_H_a(3);

        System.out.println("Area circle = " + circle.getArea());
        System.out.println("Area square = " + square.getArea());
        System.out.println("Area triangle = " + triangle.getArea());
    }
}
