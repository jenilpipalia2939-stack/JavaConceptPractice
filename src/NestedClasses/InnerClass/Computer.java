package NestedClasses.InnerClass;

public class Computer {
    public static class Processor {
        public void displayDetails() {
            System.out.println("Hp Laptop");
            System.out.print("i5 - 8th GEN, 1.60GHz");
        }
    }
    
    public void showProcessorDetails() {
        Processor processor = new Processor();
        processor.displayDetails();
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.showProcessorDetails();
    }
}
