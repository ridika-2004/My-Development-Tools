import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        student.takeInput();

        Course course = new Course();
        course.takeInput();

        Grade grade = new Grade();
        grade.takeInput();

        System.out.println("\n--- Student Information ---");
        student.displayInfo();

        System.out.println("\n--- Course Information ---");
        course.displayInfo();

        System.out.println("\n--- Grade Information ---");
        grade.displayGrades();

        sc.close();
    }
}