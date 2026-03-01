package Constructor;

public class Classroom {
    private String className;
    private String[] student;

    public Classroom(String className, String[] student) {
        this.className = className;
        this.student = student;
    }

    public String getClassName() {
        return className;
    }

    public String getStudentName() {
        for (String studentName : student) {
            System.out.println(studentName);
        }
        return "";
    }

    public static void main(String[] args) {
        String[] studentName = new String[3];
        studentName[0] = "Jenil";
        studentName[1] = "Jeni";
        studentName[2] = "Jenu";
        Classroom classroom = new Classroom("Classroom", studentName);
        System.out.println(classroom.getClassName());
        System.out.println(classroom.getStudentName());
    }
}