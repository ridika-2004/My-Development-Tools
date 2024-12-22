import java.util.Scanner;

public class Course {
    public String course1, course2, course3, course4, course5;
    public int code1, code2, code3, code4, code5;
    public Scanner sc = new Scanner(System.in);

    public void takeInput(){
        System.out.print("Input course 1: ");
        course1 = sc.nextLine();
        System.out.print("Input course code: ");
        code1 = sc.nextInt();
        System.out.print("Input course 2: ");
        course2 = sc.nextLine();
        System.out.print("Input course code: ");
        code2 = sc.nextInt();
        System.out.print("Input course 3: ");
        course3 = sc.nextLine();
        System.out.print("Input course code: ");
        code3 = sc.nextInt();
        System.out.print("Input course 4: ");
        course4 = sc.nextLine();
        System.out.print("Input course code: ");
        code4 = sc.nextInt();
        System.out.print("Input course 5: ");
        course5 = sc.nextLine();
        System.out.print("Input course code: ");
        code5 = sc.nextInt();
    }

    public void displayInfo(){
        System.out.println("Course name: "+course1+" | Course ID: "+code1);
        System.out.println("Course name: "+course2+" | Course ID: "+code2);
        System.out.println("Course name: "+course3+" | Course ID: "+code3);
        System.out.println("Course name: "+course4+" | Course ID: "+code4);
        System.out.println("Course name: "+course5+" | Course ID: "+code5);
    }
}
