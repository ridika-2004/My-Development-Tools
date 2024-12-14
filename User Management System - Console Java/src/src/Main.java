package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter password:");

        String inputPassword = scanner.nextLine();

        User user = null;

        if (inputPassword.equals("123")) {
            user = new Regular();
            user.readFromFile("User.txt");

        } else if (inputPassword.equals("234")) {
            user = new Power();
            user.readFromFile("User.txt");

            System.out.println("Enter data to write to file:");
            String data = scanner.nextLine();
            ((Power) user).writeToFile("User.txt", data);

        } else if (inputPassword.equals("345")) {
            user = new Admin();
            user.readFromFile("Admin.txt");

            System.out.println("Add user:");
            String data = scanner.nextLine();
            ((Admin) user).writeToFile("user.txt", data);

            System.out.println("Enter id to update");
            int id = scanner.nextInt();
            System.out.println("Enter new usertype");
            int newId= scanner.nextInt();
            if(newId==3)
            {
                ((Admin) user).promoteUser(id,"user.txt", "admin.txt");
            }
            else
            {
                ((Admin) user).updateUser(id,newId, "user.txt");
            }

            System.out.println("Enter the current file name to rename:");
            String oldFileName = scanner.nextLine();
            System.out.println("Enter the new file name:");
            String newFileName = scanner.nextLine();
            ((Admin) user).renameFile(oldFileName, newFileName);

        } else {
            System.out.println("Invalid password.");
        }

        scanner.close();
    }
}
