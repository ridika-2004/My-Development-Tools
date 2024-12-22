import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class LoginForm extends JFrame{

    private final Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    public void initializa(){
        //Login Panel
        JLabel jLoginForm = new JLabel("Login Form", SwingConstants.CENTER);
        jLoginForm.setFont(mainFont);

        JLabel jEmail = new JLabel("Email");
        jEmail.setFont(mainFont);

        setTitle("Login Form");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400,500);
        setMinimumSize(new Dimension(350,450));
        setLocationRelativeTo(null);
        setVisible(true);
    }
}