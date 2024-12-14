package Login;

import java.nio.file.Files;
import java.nio.file.Path;

public class Validator {
    
    public static boolean validator(String parameter, String fileString, int index){
        try {
            String content = Files.readString(Path.of(fileString)).trim();
            String[] lines = content.split("\n");
            for(String line : lines){
                String[] parts = line.split(",");
                if(parts[index].equalsIgnoreCase(parameter)){
                    return true;
                }
            }
            return false;

        } 
        catch (Exception e) {
            //e.printStackTrace();
            return false;
        }
    }
}
