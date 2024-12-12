package Login;
import java.util.Scanner;

public class Login {
    private String username;
    private String email;
    private String password;
    private static final Scanner scanner = new Scanner(System.in);

    public void login(String registerfileString, String loginfileString){
        while (true) {

            System.out.print("Enter your Username: ");
            username = scanner.nextLine().trim();
            System.out.print("Enter your Email: ");
            email = scanner.nextLine().trim();
            System.out.print("Enter your Password: ");
            password = scanner.nextLine().trim();

            if(LoginMatcher.LoginMatched(username, email, password, registerfileString)){
                System.out.println("You logged in");
                break;
            }
            else{
                System.out.println("This username or password doesn't exists. Please register before you login");
                Register register = new Register();
                register.register("src\\File\\registeree.txt");
            }
        }
    }
}
