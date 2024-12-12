package src;

import java.nio.file.Files;
import java.nio.file.Path;

public class PrintFile {
     public void read(String filepath){
        try {
            String content = Files.readString(Path.of(filepath)).trim();
            String[] lines = content.split("\n");
            for(String line : lines){
                String[] parts = line.split(",");
                System.out.println(parts[0] +" : "+ parts[1]);
            }
        } 
        catch (Exception e) {
            // TODO: handle exception
        }
        
     }
}
