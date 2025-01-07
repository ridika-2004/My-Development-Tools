package screen;

import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;

public class TitleScreenGui extends JFrame {
    public TitleScreenGui(){
        super("Title Screen");
        setSize(400,565);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(CommonConstants.offwhite);
        addGuiComponents();
    }

    private void addGuiComponents(){
        JLabel titleLabel = new JLabel("Quiz application!!");
        titleLabel.setFont(new Font("Arial",Font.BOLD,36));
        titleLabel.setBounds(0,20,390,43);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setForeground(CommonConstants.dark_blue);
        add(titleLabel);
    }
}
