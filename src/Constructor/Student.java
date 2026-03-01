package Constructor;

public class Student {
    private String studentId;
    private String studentName;
    private char grade;

    public Student() {
        this("None", "Unknown", 'D');
    }

    public Student(String studentId, String studentName, char grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public char getGrade(){
        return grade;
    }

    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
    }

}   
