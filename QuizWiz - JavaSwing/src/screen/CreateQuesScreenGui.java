package screen;

import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;

public class CreateQuesScreenGui extends JFrame {
    private JTextArea questionTextArea;
    private JTextField categoryTextField;

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
        titleLabel.setForeground(CommonConstants.dark_blue);
        add(titleLabel);

        JLabel questionLabel = new JLabel("Question: ");
        questionLabel.setFont(new Font("Arial",Font.BOLD,16));
        questionLabel.setBounds(50,60,93,20);
        questionLabel.setForeground(CommonConstants.dark_blue);
        add(questionLabel);

        questionTextArea = new JTextArea();
        questionTextArea.setFont(new Font("Arial",Font.BOLD,16));
        questionTextArea.setBounds(50,90,310,110);
        questionTextArea.setForeground(CommonConstants.dark_blue);
        questionTextArea.setLineWrap(true);
        questionTextArea.setWrapStyleWord(true);
        add(questionTextArea);

        JLabel categoryLabel = new JLabel("Category : ");
        categoryLabel.setFont(new Font("Arial",Font.BOLD,16));
        categoryLabel.setBounds(50,250,93,20);
        categoryLabel.setForeground(CommonConstants.dark_blue);
        add(categoryLabel);

        categoryTextField = new JTextField();
        categoryTextField.setFont(new Font("Arial",Font.BOLD,16));
        categoryTextField.setBounds(50,280,310,36);
        categoryTextField.setForeground(CommonConstants.dark_blue);
        add(categoryTextField);
    }

}
