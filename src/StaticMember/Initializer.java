package StaticMember;

public class Initializer {
    private static int initialValue;
    public static void Initializer() {
        initialValue = 1000;
    }

    public static void main(String[] args) {
        System.out.print(initialValue);
        Initializer();
        System.out.print(initialValue);
    }
}
