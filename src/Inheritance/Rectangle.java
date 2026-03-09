package Inheritance;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        System.out.println(length * width);
        return length * width;
    }

}
