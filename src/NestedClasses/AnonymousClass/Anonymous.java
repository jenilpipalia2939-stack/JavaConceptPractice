package NestedClasses.AnonymousClass;

public class Anonymous implements Greeting {
    @Override
    public void sayHello() {
        System.out.print("Hello, World!");
    }

    public static void main(String[] args) {
        Greeting greeting = new Anonymous();
        greeting.sayHello();
    }
}
