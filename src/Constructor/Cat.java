package Constructor;

public class Cat {
    private String name;
    private int age;

    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public int getInt() {
        return age;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println(cat1.getName());
        System.out.println(cat1.getInt());
    }
}
