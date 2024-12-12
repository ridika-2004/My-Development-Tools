package Login;

import java.io.File;
import java.util.Scanner;

public class LoginMatcher {
    public static boolean LoginMatched(String username, String email, String password, String fileString){
        try{
            File file = new File(fileString);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String hashedPassword = HashPassword.hashPassword(password);
                if(line.contains(username) && line.contains(email) && line.contains(hashedPassword)){
                    return true;
                }                
            }
            return false;
       }
       catch(Exception e){
            //e.printStackTrace();
            return false;
       }
    }
}
