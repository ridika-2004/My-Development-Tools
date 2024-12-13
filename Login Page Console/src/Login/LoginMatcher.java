package Login;

import java.nio.file.Files;
import java.nio.file.Path;

public class LoginMatcher {
    public static boolean LoginMatched(String username, String email, String password, String fileString){
        String hashedPassword = HashPassword.hashPassword(password);
        try{
            String content = Files.readString(Path.of(fileString)).trim();
            String[] lines = content.split("\n");
            for(String line : lines){
                String[] parts = line.split(",");
                if(parts[0].equalsIgnoreCase(username) && parts[1].equalsIgnoreCase(email) && parts[2].equalsIgnoreCase(hashedPassword)){
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
