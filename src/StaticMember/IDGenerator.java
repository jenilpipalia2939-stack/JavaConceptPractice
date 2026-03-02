package StaticMember;

public class IDGenerator {
    private static int nextID = 0;
    public static int generateID() {
        nextID++;
        return nextID;
    }

    public static void main(String[] args) {
        System.out.println(generateID());
        System.out.println(generateID());
    }
}
