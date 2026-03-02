package StaticMember;

public class Counter {
    private static int count;

    public Counter() {
        count++;
    }

    public static void printCount() {
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        printCount();
    }
}


// 1. Static Variables
// Write a Java program to create a class called "Counter" with a static variable count. Implement a constructor that increments count every time an object is created. Print the value of count after creating several objects.
// So, i have created one counter class with static variable and a constructor for object creation and increment count also in it, to get know about how many object are created.
// Also, static method printCount() to get know about final count.