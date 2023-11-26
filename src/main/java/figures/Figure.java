package main;

public abstract class Figure implements IFigure {
    String name;

    public Figure(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
