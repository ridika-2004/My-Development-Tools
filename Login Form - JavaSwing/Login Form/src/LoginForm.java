import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class LoginForm extends JFrame{

    private final Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfEmaField;
    JPasswordField pfPassword;

    public void initializa(){
        //Login Panel
        JLabel jLoginForm = new JLabel("Login Form", SwingConstants.CENTER);
        jLoginForm.setFont(mainFont);

        JLabel jEmail = new JLabel("Email");
        jEmail.setFont(mainFont);

        tfEmaField = new JTextField();
        tfEmaField.setFont(mainFont);

        JLabel labelPassword = new JLabel("Password");
        labelPassword.setFont(mainFont);

        pfPassword = new JPasswordField();
        pfPassword.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(0,1,10,10));

        formPanel.add(labelPassword);
        formPanel.add(jEmail);
        formPanel.add(tfEmaField);
        formPanel.add(labelPassword);
        formPanel.add(pfPassword);

        //buttons panel
        JButton logiButton = new JButton("Login");
        logiButton.setFont(mainFont);

        logiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = tfEmaField.getText();
                String password = String.valueOf(pfPassword.getPassword());

                User user = getAuthenticatedUser(email,password);

                if(user!=null){
                    MainFrame mainFrame = new MainFrame();
                    mainFrame.initialize(user);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(LoginForm.this,
                    "Email or password invalid",
                    "Try again", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        });

        //initialize the frame
        add(formPanel, BorderLayout.NORTH);


        setTitle("Login Form");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400,500);
        setMinimumSize(new Dimension(350,450));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private User getAuthenticatedUser(String email, String password){
        User user = null;

        final String db_url = "jdbc:mysql://localhost:3306/login_form";
        final String username = "root";
        final String db_password = "Ridnin990";

        try {
            Connection conn = DriverManager.getConnection(db_url, username, db_password);
            String sql = "selet * from users where email=? and password=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                user = new User();
                user.name = resultSet.getString("name");
                user.email = resultSet.getString("email");
                user.phone = resultSet.getString("phone");
                user.address = resultSet.getString("address");
                user.password = resultSet.getString("password");

            }

            preparedStatement.close();
            conn.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}