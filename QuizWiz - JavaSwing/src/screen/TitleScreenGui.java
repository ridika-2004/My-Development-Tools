package screen;

import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;

public class TitleScreenGui extends JFrame {

    private JComboBox categoriesMenu;
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
    }
}
