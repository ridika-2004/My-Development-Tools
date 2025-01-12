package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
    private static final String dburl = "jdbc:mysql://127.0.0.1/quizwiz";
    private static final String dbusername = "root";
    private static final String dbpass = "Ridnin990";

    private static boolean insertQuesToDB(String question, String category, String[] answer, int correctIndex){
        try {
            Connection connection = DriverManager.getConnection(dburl,dbusername,dbpass);

        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
