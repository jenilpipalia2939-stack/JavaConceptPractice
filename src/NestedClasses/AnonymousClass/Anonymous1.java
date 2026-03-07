package NestedClasses.AnonymousClass;

public class Anonymous1 extends Animal {
    @Override
    void makeSound() {
        System.out.println("I'm anonymous class");
    }

    public static void main(String[] args) {
        Animal animal = new Anonymous1();
        animal.makeSound();
    }
}
