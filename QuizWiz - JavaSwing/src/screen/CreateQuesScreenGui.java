package screen;

import constants.CommonConstants;

import javax.swing.*;

public class CreateQuesScreenGui extends JFrame {
    public CreateQuesScreenGui(){
        super("Create a Question");
        setSize(851,565);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(CommonConstants.offwhite);
    }
}
