package StaticMember;

public class ComplexInitializer {
    private static int x;
    private static int y;
    private static int z;
    static {
        x = 1;
        y = 2;
        z = calculateZ(x, y);
    }

    private static int calculateZ(int a, int b) {
        return a + b * (a + b);
    }

    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
