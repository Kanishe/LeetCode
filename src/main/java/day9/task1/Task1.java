package day9.task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("GRP01","Alex");
        Teacher teacher = new Teacher("Mr.Smth","Clerks");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubject());

        student.printInfo();
        teacher.printInfo();
    }
}
