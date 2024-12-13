package src;

import java.util.Scanner;

public class OrderIceCream {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Order Ice-cream");
            System.out.println("2. Exit");
            
            choice = scanner.nextInt();
            //scanner.nextLine();

            switch (choice) {
                case 1:
                    PrintFile printFile = new PrintFile();
                    printFile.order();
                    break;

                case 2:    
                    System.out.println("Goodbye........");
                    break;
        
                default:
                    break;
            }

        } 
        while (choice!=2);
            scanner.close();
    }
    
}
