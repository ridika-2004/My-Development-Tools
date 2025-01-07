package screen;

import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;

public class TitleScreenGui extends JFrame {

    private JComboBox categoriesMenu;
    private JTextField numOfQuestionsTextField;

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

        JLabel chooseCategoryLabel = new JLabel("Choose a Category");
        chooseCategoryLabel.setFont(new Font("Arial",Font.BOLD,16));
        chooseCategoryLabel.setBounds(0,90,400,43);
        chooseCategoryLabel.setHorizontalAlignment(SwingConstants.CENTER);
        chooseCategoryLabel.setForeground(CommonConstants.dark_blue);
        add(chooseCategoryLabel);

        String[] categories = new String[]{"Math", "Programming", "History"};
        categoriesMenu = new JComboBox(categories);
        categoriesMenu.setBounds(20,130,337,45);
        categoriesMenu.setForeground(CommonConstants.dark_blue);
        add(categoriesMenu);

        JLabel numOfQuestions = new JLabel("Number of questions: ");
        numOfQuestions.setFont(new Font("Arial",Font.BOLD,16));
        numOfQuestions.setBounds(20,190,172,20);
        numOfQuestions.setHorizontalAlignment(SwingConstants.CENTER);
        numOfQuestions.setForeground(CommonConstants.dark_blue);
        add(numOfQuestions);

        numOfQuestionsTextField = new JTextField("10");
        numOfQuestionsTextField.setFont(new Font("Arial",Font.BOLD,16));
        numOfQuestionsTextField.setBounds(200,190,148,26);
        numOfQuestionsTextField.setHorizontalAlignment(SwingConstants.CENTER);
        numOfQuestionsTextField.setForeground(CommonConstants.dark_blue);
        add(numOfQuestionsTextField);

        JButton startButton = new JButton("Start");
        startButton.setFont(new Font("Arial",Font.BOLD,16));
        startButton.setBounds(65,290,262,45);
        startButton.setBackground(CommonConstants.lightorange);
        startButton.setForeground(CommonConstants.dark_blue);
        add(startButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Arial",Font.BOLD,16));
        exitButton.setBounds(65,350,262,45);
        exitButton.setBackground(CommonConstants.lightorange);
        exitButton.setForeground(CommonConstants.dark_blue);
        add(exitButton);

        JButton createAQuestionButton = new JButton("Create A Question");
        createAQuestionButton.setFont(new Font("Arial",Font.BOLD,16));
        createAQuestionButton.setBounds(65,410,262,45);
        createAQuestionButton.setBackground(CommonConstants.lightorange);
        createAQuestionButton.setForeground(CommonConstants.dark_blue);
        add(createAQuestionButton);
    }
}
