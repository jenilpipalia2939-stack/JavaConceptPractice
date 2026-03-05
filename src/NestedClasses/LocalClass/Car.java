package NestedClasses.LocalClass;

public class Car {

    public void startEngine() {
        class Engine {
            public void run() {
                System.out.println("Engine is running");
            }
        }

        Engine e1 = new Engine();
        e1.run();
    }

    public static void main(String[] args) {
        Car Fortuner = new Car();
        Fortuner.startEngine();
    }
}
