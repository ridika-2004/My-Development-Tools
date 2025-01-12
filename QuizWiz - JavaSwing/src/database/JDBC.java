package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC {
    private static final String dburl = "jdbc:mysql://127.0.0.1/quizwiz";
    private static final String dbusername = "root";
    private static final String dbpass = "Ridnin990";

    private static boolean insertQuesToDB(String question, String category, String[] answer, int correctIndex){
        try {
            Connection connection = DriverManager.getConnection(dburl,dbusername,dbpass);
            Category categoryObj = getCategory(category);
            if(categoryObj==null){
                categoryObj = insertCategory(category);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static Category getCategory(String category){
        try{
            Connection connection = DriverManager.getConnection(dburl,dbusername,dbpass);
            PreparedStatement getCategoryQuery = connection.prepareStatement("select * from category where categorycol = ?");
            getCategoryQuery.setString(1,category);
            ResultSet resultSet = getCategoryQuery.executeQuery();

            if(resultSet.next()){
                int categoryId = resultSet.getInt("categoryid");
                return new Category(categoryId,category);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    private static Category insertCategory(String category){
        try{
            Connection connection = DriverManager.getConnection(dburl,dbusername,dbpass);
            PreparedStatement getCategoryQuery = connection.prepareStatement("select * from category where categorycol = ?");
            getCategoryQuery.setString(1,category);
            ResultSet resultSet = getCategoryQuery.executeQuery();

            if(resultSet.next()){
                int categoryId = resultSet.getInt("categoryid");
                return new Category(categoryId,category);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
