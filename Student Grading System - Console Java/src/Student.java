import java.util.Scanner;

public class Student {
    public int id;
    public String name;
    public Scanner sc = new Scanner(System.in);

    public void takeInput(){
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your id: ");
        id = sc.nextInt();
    }

    public void displayInfo(){
        System.out.println("Student name: "+name);
        System.out.println("Student ID: "+id);
    }
}
