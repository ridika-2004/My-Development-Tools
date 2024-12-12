package Login;

import java.io.File;
import java.util.Scanner;

public class Validator {
    
    public static boolean validator(String parameter, String fileString){
        try {
            File file = new File(fileString);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line.contains(parameter)){
                    return false;
                }                
            }
            return true;

        } 
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
