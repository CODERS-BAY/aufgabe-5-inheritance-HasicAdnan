package main;

public class Rectangle extends Figure {

    double length;
    double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
