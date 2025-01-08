package screen;

import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;

public class CreateQuesScreenGui extends JFrame {
    public CreateQuesScreenGui(){
        super("Create a Question");
        setSize(851,565);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(CommonConstants.offwhite);
        addGuiComponents();
    }

    private void addGuiComponents(){
        JLabel titleLabel = new JLabel("Create Your Own Question");
        titleLabel.setFont(new Font("Arial",Font.BOLD,24));
        titleLabel.setBounds(50,15,310,29);
        //titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setForeground(CommonConstants.dark_blue);
        add(titleLabel);
    }

}
