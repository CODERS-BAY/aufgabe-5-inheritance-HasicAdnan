package figures;

public final class MyRectangle extends Rectangle {
    String color;

    public MyRectangle(String name, double length, double width, String color) {
        super(name, length, width);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return "My " + color + " " + getName() + " has " + calculatePerimeter() + " perimeter and " + calculateArea() + " area.";
    }
}
