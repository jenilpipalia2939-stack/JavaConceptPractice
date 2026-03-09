package Inheritance;

public class HRManager extends Employee {

    public HRManager(int salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("I'm working as a HRManager");
    }

    public void addEmployee() {
        System.out.println("I'm adding a HRManager");
    }
}