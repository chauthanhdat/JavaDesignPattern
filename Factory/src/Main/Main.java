package Main;

import Color.Color;
import Shape.Shape;
import Factory.*;

public class Main {

    public static void main(String[] args) {

        // get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();

        // get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Color color1 = colorFactory.getColor("red");
        color1.fill();

        Color color2 = colorFactory.getColor("green");
        color2.fill();

        Color color3 = colorFactory.getColor("blue");
        color3.fill();
    }
}
