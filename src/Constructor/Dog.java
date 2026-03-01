package Constructor;

public class Dog {
    private String name;
    private String color;

    public Dog(String dogName, String dogColor) {
        this.name = dogName;
        this.color = dogColor;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("German Sheperd", "Brown-Black");
        System.out.println(dog1.getName());
        System.out.println(dog1.getColor());
    }
}