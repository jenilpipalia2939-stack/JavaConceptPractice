package Constructor;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        System.out.println("Singleton Constructor is called");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Main method to test the Singleton class
    public static void main(String[] args) {
        // Get the single instance of Singleton
        Singleton instance1 = Singleton.getInstance();
        // Try to get another instance of Singleton
        Singleton instance2 = Singleton.getInstance();

        // Check if both instances are the same
        if (instance1 == instance2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }
}
