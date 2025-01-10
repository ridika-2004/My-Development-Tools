package screen;

import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;

public class CreateQuesScreenGui extends JFrame {
    private JTextArea questionTextArea;
    private JTextField categoryTextField;
    private JRadioButton[] answerRadioButtons;
    private ButtonGroup buttonGroup;
    private JTextField[] answerTextFields;

    public CreateQuesScreenGui(){
        super("Create a Question");
        setSize(851,565);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(CommonConstants.offwhite);
        answerRadioButtons = new JRadioButton[4];
        answerTextFields = new JTextField[4];
        buttonGroup = new ButtonGroup();

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

        addAnswerComponents();

        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial",Font.BOLD,16));
        submitButton.setBounds(300,440,262,45);
        submitButton.setForeground(CommonConstants.dark_blue);
        submitButton.setBackground(CommonConstants.white);
        add(submitButton);

        JLabel goBackLabel = new JLabel("Go Back");
        goBackLabel.setFont(new Font("Arial",Font.BOLD,16));
        goBackLabel.setBounds(300,495,262,20);
        goBackLabel.setForeground(CommonConstants.dark_blue);
        goBackLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(goBackLabel);
    }

    private void addAnswerComponents()
    {
        int verticalSpacing = 100;
        for(int i=0;i<4;i++){
            JLabel answerLabel = new JLabel("Answer "+(i+1));
            answerLabel.setFont(new Font("Arial",Font.BOLD,16));
            answerLabel.setBounds(470,55+(i*verticalSpacing),93,20);
            answerLabel.setForeground(CommonConstants.dark_blue);
            add(answerLabel);

            answerRadioButtons[i] = new JRadioButton();
            answerRadioButtons[i].setBounds(440,100+(i*verticalSpacing),21,21);
            answerRadioButtons[i].setBackground(null);
            buttonGroup.add(answerRadioButtons[i]);
            add(answerRadioButtons[i]);

            answerTextFields[i] = new JTextField();
            answerTextFields[i].setBounds(470,85+(i*verticalSpacing),310,36);
            answerTextFields[i].setFont(new Font("Arial",Font.PLAIN,16));
            answerTextFields[i].setForeground(CommonConstants.dark_blue);
            add(answerTextFields[i]);
        }
    }

}
