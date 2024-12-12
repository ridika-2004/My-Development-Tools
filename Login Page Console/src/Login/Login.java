package Login;
import java.io.Console;
import java.util.Scanner;

public class Login {

    private static final Scanner scanner = new Scanner(System.in);

    public void login(String registerfileString){
        while (true) {

            Console console = System.console();
            if (console == null) {
                System.out.println("No console available. Please run this program in a terminal or command prompt.");
                return;
            }
            
            System.out.print("Enter your Username: ");
            String username = scanner.nextLine().trim();
            System.out.print("Enter your Email: ");
            String email = scanner.nextLine().trim();
            System.out.print("Enter your Password: ");
            char[] passwordArray = console.readPassword();
            String password = new String(passwordArray);

            if(LoginMatcher.LoginMatched(username, email, password, registerfileString)){
                System.out.println("You logged in");
                break;
            }
            else{
                System.out.println("This username or email doesn't exists. Or the password doesn't match. Please register before you login");
                break;
            }
        }

    }

}
