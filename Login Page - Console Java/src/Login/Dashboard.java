package Login;

import java.util.Scanner;

public class Dashboard {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Forgot Password");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Login login = new Login();
                    login.login("src\\File\\registeree.txt");
                    break;

                case 2:
                    Register register = new Register();
                    register.register("src\\File\\registeree.txt");
                    break;    

                case 3:    
                    ForgotPassword forgotPassword = new ForgotPassword();
                    forgotPassword.forgotPassword();
                    break;

                case 4:    
                    System.out.println("Goodbye........");
                    break;    
        
                default:
                    break;
            }

        } 
        while (choice!=4);
            scanner.close();
    }
}
