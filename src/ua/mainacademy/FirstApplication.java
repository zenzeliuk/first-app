package ua.mainacademy;

import ua.mainacademy.model.Circle;
import ua.mainacademy.model.Figure;
import ua.mainacademy.model.Rectangle;
import ua.mainacademy.model.Square;

public class FirstApplication {

    public static void main(String[] args) {
        Circle circleOne = new Circle();
        Circle circleTwo = new Circle();
        circleOne.setRadius(10);
        circleTwo.setRadius(20);

        System.out.println(circleOne.getArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setSideA(5);
        rectangle.setSideB(4);
        System.out.println(rectangle.getArea());


    }
}
