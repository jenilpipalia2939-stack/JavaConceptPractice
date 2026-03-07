package NestedClasses.LocalClass;

public class House {
    public void calculateArea() {
        final double length = 12.5;
        final double width = 7.0;
        class Room {
            double getArea() {
                return length * width;
            }
        }
        Room area  = new Room();
        System.out.println(area.getArea());
    }

    public static void main(String[] args) {
        House house = new House();
        house.calculateArea();
    }
}
