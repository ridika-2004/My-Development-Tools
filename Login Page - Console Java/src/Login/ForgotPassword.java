package Login;

import java.io.Console;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ForgotPassword {
    
    private static final String fileString = "src\\File\\registeree.txt";
    private static final Scanner scanner = new Scanner(System.in);

    public void forgotPassword(){

            Console console = System.console();
            System.out.print("Enter your Username: ");
            String username = scanner.nextLine().trim();
            System.out.print("Enter your Email: ");
            String email = scanner.nextLine().trim();
         try {
            String content = Files.readString(Path.of(fileString)).trim();
            String[] lines = content.split("\n");
            for(String line : lines){
                String[] parts = line.split(",");
                if(parts[0].equalsIgnoreCase(username) && parts[1].equalsIgnoreCase(email)){
                    System.out.println("Type new password: ");
                    char[] passwordArray = console.readPassword();
                    String password = new String(passwordArray);
                    System.out.println("Password changed");
                    parts[2] = password;
                }
                String data = parts[0]+","+parts[1]+","+HashPassword.hashPassword(parts[2]);
                FileWriter fileWriter = new FileWriter(fileString,true);
                fileWriter.append(data+"\n");
                fileWriter.close();
                
            }
            System.out.println("Your username or password doesn't match");
            System.out.println("Go for register instead");
    
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
