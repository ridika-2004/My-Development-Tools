package Login;

import java.io.Console;
import java.io.FileWriter;
import java.util.Scanner;

public class Register {
    private static final Scanner scanner = new Scanner(System.in);

    public void register(String fileString){
        while (true) {

            Console console = System.console();
            if (console == null) {
                System.out.println("No console available. Please run this program in a terminal or command prompt.");
                return;
            }
            
            System.out.print("Enter your Username: ");
            String username = scanner.nextLine().trim();
            System.out.print("Enter your Email: ");
            String email = scanner.nextLine().trim();
            System.out.print("Enter your Password: ");
            char[] passwordArray = console.readPassword();
            String password = new String(passwordArray);

            if(Validator.validator(username,fileString) && Validator.validator(email,fileString)){
                saveDetails(username+","+email+","+HashPassword.hashPassword(password), fileString);
                break;
            }
            else{
                System.out.println("This username or email already exists. Please try a unique one");
            }
        }
    }

    private void saveDetails(String details, String fileString){
        try{
            FileWriter fileWriter = new FileWriter(fileString,true);
            fileWriter.append(details+"\n");
            fileWriter.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
