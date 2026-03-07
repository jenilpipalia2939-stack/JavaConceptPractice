package NestedClasses.StaticNestedClassMethod;

public class MathUtil {

    static class Calculator {
        static int add(int a, int b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        int sum = MathUtil.Calculator.add(78,55);
        System.out.println(sum);
        System.out.println(Calculator.add(10, 20));
    }
}
