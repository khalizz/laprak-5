package praktic.geometry.shapes;

import praktic.geometry.bases.CircularShape;

public class Circle extends CircularShape {
    public Circle(double radius) {
        super("Circle", radius);
    }

    public double getArea() {
        return (22 * radius * radius) / 7;
    }

    public double getPerimeter() {
        return (2 * 22 * radius) / 7;
    }

    public void printInfo() {
        System.out.println("Name            : " + name);
        System.out.println("Area            : " + getArea());
        System.out.println("Perimeter       : " + getPerimeter());
    }
}
