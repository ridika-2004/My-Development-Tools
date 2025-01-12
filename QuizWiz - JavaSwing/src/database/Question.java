package database;

import java.util.ArrayList;

public class Question {
    private int questionId;
    private int categoryId;
    private String questionText;
    private ArrayList<Answer> answers;

    public int getQuestionId() {
        return questionId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    public Question(int questionId, int categoryId, String questionText) {
        this.questionId = questionId;
        this.categoryId = categoryId;
        this.questionText = questionText;
    }


}
