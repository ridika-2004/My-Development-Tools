package Login;
import java.util.Scanner;

public class Login {
    private String username;
    private String email;
    private String password;
    private boolean logged= false;
    private static final Scanner scanner = new Scanner(System.in);

    public void login(String registerfileString){
        while (true) {

            System.out.print("Enter your Username: ");
            username = scanner.nextLine().trim();
            System.out.print("Enter your Email: ");
            email = scanner.nextLine().trim();
            System.out.print("Enter your Password: ");
            password = scanner.nextLine().trim();

            if(LoginMatcher.LoginMatched(username, email, password, registerfileString)){
                System.out.println("You logged in");
                logged = true;
                break;
            }
            else{
                System.out.println("This username or email doesn't exists. Please register before you login");
                Register register = new Register();
                register.register(registerfileString);
                break;
            }
        }
        if(!logged){
            login("src\\File\\registeree.txt");
        }
    }

}
