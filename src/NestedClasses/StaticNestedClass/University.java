package NestedClasses.StaticNestedClass;

public class University {

    static class Department {
        private String departmentName;
        private int noOfFaculty;

        public Department(String departmentName, int noOFFaculty) {
            this.departmentName = departmentName;
            this.noOfFaculty = noOFFaculty;
        }

        public void displayInfo() {
            System.out.println("Department Name: " + departmentName);
            System.out.println("Number of Faculty: " + noOfFaculty);
        }
    }

    public static void main(String[] args) {
        Department department = new Department("Mech", 2);
        department.displayInfo();
    }
}
