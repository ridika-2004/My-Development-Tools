package Login;

import java.io.FileWriter;
import java.util.Scanner;

public class Register {
    private String username;
    private String email;
    private String password;
    private static final Scanner scanner = new Scanner(System.in);

    public void register(String fileString){
        while (true) {

            System.out.print("Enter your Username: ");
            username = scanner.nextLine().trim();
            System.out.print("Enter your Email: ");
            email = scanner.nextLine().trim();
            System.out.print("Enter your Password: ");
            password = scanner.nextLine().trim();

            if(Validator.validator(username,fileString) && Validator.validator(email,fileString)){
                break;
            }
            else{
                System.out.println("This username or password already exists. Please try a unique one");
            }
        }

        saveDetails(username+email+password, fileString);
    }

    private void saveDetails(String details, String fileString){
        try{
            FileWriter fileWriter = new FileWriter(fileString);
            fileWriter.append(details+"\n");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
