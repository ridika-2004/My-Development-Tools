import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private Scanner sc = new Scanner(System.in);

    public void takeInput() {
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your ID: ");
        id = sc.nextInt();
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
    }
}