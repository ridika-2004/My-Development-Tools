package database;

import java.sql.*;

public class JDBC {
    private static final String dburl = "jdbc:mysql://127.0.0.1/quizwiz";
    private static final String dbusername = "root";
    private static final String dbpass = "Ridnin990";

    private static boolean saveQuesAndAnsToCategory(String question, String category, String[] answer, int correctIndex){
        try {
            Connection connection = DriverManager.getConnection(dburl,dbusername,dbpass);
            Category categoryObj = getCategory(category);
            if(categoryObj==null){
                categoryObj = insertCategory(category);
            }

            Question questionObj = insertQustion(categoryObj,question);
            insertAnswers(questionObj, answer, correctIndex);

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static Question insertQustion(Category category, String questionText){
        try{
            Connection connection = DriverManager.getConnection(dburl,dbusername,dbpass);
            PreparedStatement insertQuestionQuery = connection.prepareStatement("insert into question (categoryid, questiontext) values(?,?)", Statement.RETURN_GENERATED_KEYS);
            insertQuestionQuery.setInt(1,category.getCategoryId());
            insertQuestionQuery.setString(2,questionText);
            insertQuestionQuery.executeUpdate();

            ResultSet resultSet = insertQuestionQuery.getGeneratedKeys();
            if(resultSet.next()){
                int questionid = resultSet.getInt(1);
                return new Question(questionid, category.getCategoryId(), questionText);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
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
            PreparedStatement insertCategoryQuery = connection.prepareStatement("insert into category (categorycol) values(?)", Statement.RETURN_GENERATED_KEYS);
            insertCategoryQuery.setString(1,category);
            insertCategoryQuery.executeUpdate();
            ResultSet resultSet = insertCategoryQuery.getGeneratedKeys();
            if(resultSet.next()){
                int categoryid = resultSet.getInt(1);
                return new Category(categoryid,category);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    private static boolean insertAnswers(Question question, String[] answers, int correctIndex){
        try{
            Connection connection = DriverManager.getConnection(dburl,dbusername,dbpass);
            PreparedStatement insertAnswerQuery = connection.prepareStatement("insert into answer (questionid, answertext, iscorrect) values(?,?,?)");
            insertAnswerQuery.setInt(1,question.getQuestionId());
            for(int i=0;i<answers.length;i++){
                insertAnswerQuery.setString(2, answers[i]);
                if(i==correctIndex){
                    insertAnswerQuery.setBoolean(3, true);
                } else {
                    insertAnswerQuery.setBoolean(3,false);
                }

                insertAnswerQuery.executeUpdate();
            }
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;

    }
}
