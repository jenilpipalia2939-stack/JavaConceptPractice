package Collections;

public class Person {
    private String name;
    private int age;
    private final String DOB;

    public Person(String name, int age, String DOB) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDOB() {
        return DOB;
    }
}
