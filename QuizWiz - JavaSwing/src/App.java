import screen.CreateQuesScreenGui;
import screen.TitleScreenGui;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new TitleScreenGui().setVisible(true);
                new CreateQuesScreenGui().setVisible(true);
            }
        });
    }
}
