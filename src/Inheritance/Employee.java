package Inheritance;

public class Employee extends Person {
    private int salary;
    private String employeeId;
    private String employeeTitle;

    public Employee(int salary) {
        super();
        this.salary = salary;
    }

    public void work() {
        System.out.println("I'm working...");
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        System.out.print(super.getLastName() + getEmployeeId());
        return null;
    }

}
