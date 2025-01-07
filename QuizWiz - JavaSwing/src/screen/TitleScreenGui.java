package screen;

import constants.CommonConstants;

import javax.swing.*;

public class TitleScreenGui extends JFrame {
    public TitleScreenGui(){
        super("Title Screen");
        setSize(400,565);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(CommonConstants.offwhite);
    }
}
