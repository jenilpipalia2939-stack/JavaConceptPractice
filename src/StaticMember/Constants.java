package StaticMember;

public class Constants {
    private static final double PI = 3.14159;

    public double areaOfCircle(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Constants constant = new Constants();
        System.out.println(constant.areaOfCircle(6));
    }
}