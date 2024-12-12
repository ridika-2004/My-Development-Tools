package Login;

import java.util.Scanner;

public class Dashboard {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Login");
            System.out.println("2. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Login login = new Login();
                    login.login(null, null);
                    break;

                case 2:    
                    System.out.println("Goodbye........");
        
                default:
                    break;
            }

        } 
        while (choice!=2);
            scanner.close();
    }
}
