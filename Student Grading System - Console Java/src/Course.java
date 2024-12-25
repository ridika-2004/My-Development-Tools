import java.util.Scanner;

class Course {
    private String[] courses = new String[5];
    private int[] codes = new int[5];
    private Scanner sc = new Scanner(System.in);

    public void takeInput() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter course " + (i + 1) + " name: ");
            courses[i] = sc.nextLine();
            System.out.print("Enter course " + (i + 1) + " code: ");
            codes[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    public void displayInfo() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Course Name: " + courses[i] + " | Course Code: " + codes[i]);
        }
    }
}