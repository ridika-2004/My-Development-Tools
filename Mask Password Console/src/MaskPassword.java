import java.io.Console;
import java.io.FileWriter;

public class MaskPassword {
   
    public void maskpassword(){
        Console console = System.console();
        if (console == null) {
            System.out.println("No console available. Please run this program in a terminal or command prompt.");
            return;
        }
        System.out.print("Enter password: ");
        char[] passwordArray = console.readPassword();
        String password = new String(passwordArray);

        savepassword("src\\password.txt", password);
        System.out.println("Password saved successfully.");
    }

    private void savepassword(String filString, String password){
        try {
            FileWriter fileWriter = new FileWriter(filString, true);
            fileWriter.write(password+"\n");
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
