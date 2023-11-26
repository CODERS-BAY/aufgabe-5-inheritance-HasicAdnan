package main;

public final class MyCircle extends Circle {
     String color;

    public MyCircle(String name, double radius, String color) {
        super(name, radius);
        this.color = color;
    }

    public MyCircle(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getDescription() {
        return "My " + color + " " + getName() + " has " + calculatePerimeter() + " perimeter and " + calculateArea() + " area.";
    }
}
