package Login;

public class HashPassword {
    public static String hashPassword(String password){

        long hashedPassword;
        hashedPassword = password.hashCode();
        String hashedStringPassword = Long.toString(hashedPassword);
        return hashedStringPassword;
    }
}
