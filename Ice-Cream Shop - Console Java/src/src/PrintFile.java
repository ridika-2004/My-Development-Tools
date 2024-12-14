package src;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class PrintFile {
     public void read(String filepath){
        try {
            String content = Files.readString(Path.of(filepath)).trim();
            String[] lines = content.split("\n");
            int index=1;
            for(String line : lines){
                String[] parts = line.split(",");
                System.out.println(index +" . "+parts[0] +" : "+ parts[1]);
                index++;
            }
        } 
        catch (Exception e) {
            System.out.println("Something is wrong with reading the files");
        }
        
     }

     public void order() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ice-Cream Flavor           : Price");
        read("src\\file\\flavors.txt");
        System.out.println("");
        System.out.println("Choose the indices and write 'done' after finishing: ");
        double totalScoop = 0.0;
    
        // Handle Flavors
        while (true) {
            String scoopChoice = scanner.nextLine().trim();
            if (scoopChoice.equalsIgnoreCase("done")) {
                break;
            }
            try {
                String content = Files.readString(Path.of("src\\file\\flavors.txt")).trim();
                String[] lines = content.split("\n");
                int index = 1;
                boolean found = false;
                for (String line : lines) {
                    String[] parts = line.split(",");
                    String indexString = String.valueOf(index);
                    if (scoopChoice.equals(indexString)) {
                        totalScoop += Double.parseDouble(parts[1]);
                        found = true;
                        break;
                    }
                    index++;
                }
                if (!found) {
                    System.out.println("Invalid index. Please try again.");
                }
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("Sorry, you can't order due to an error.");
            }
        }
    
        // Handle Toppings
        System.out.println("Toppings                 : Price");
        read("src\\file\\toppings.txt");
        System.out.println("");
        System.out.println("Choose the indices and write 'done' after finishing: ");
        while (true) {
            String scoopChoice = scanner.nextLine().trim();
            if (scoopChoice.equalsIgnoreCase("done")) {
                break;
            }
            try {
                String content = Files.readString(Path.of("src\\file\\toppings.txt")).trim(); // Correct file
                String[] lines = content.split("\n");
                int index = 1;
                boolean found = false;
                for (String line : lines) {
                    String[] parts = line.split(",");
                    String indexString = String.valueOf(index);
                    if (scoopChoice.equals(indexString)) {
                        totalScoop += Double.parseDouble(parts[1]);
                        found = true;
                        break;
                    }
                    index++;
                }
                if (!found) {
                    System.out.println("Invalid index. Please try again.");
                }
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("Sorry, you can't order due to an error.");
            }
        }
    
        System.out.println("Your total payment : " + totalScoop);
        System.out.println("Thank you for ordering our ice-creams. ENJOY!!");
    }
}
