import java.util.Scanner;

class Grade {
    private float totalMarks = 0;
    private Scanner sc = new Scanner(System.in);

    public void takeInput() {
        float attendance=0;
        for(int i=0;i<5;i++){
            float quiz=0, midterm=0, finalExam=0;
            System.out.print("Enter quiz marks for course " + (i + 1) + " (out of 45) : ");
            quiz =sc.nextFloat();
            totalMarks+=quiz;
            System.out.print("Enter mid marks for course " + (i + 1) + " (out of 75) : ");
            midterm =sc.nextFloat();
            totalMarks+=midterm;
            System.out.print("Enter final marks for course " + (i + 1) + " (out of 150) : ");
            finalExam =sc.nextFloat();
            totalMarks+=finalExam;
            System.out.print("Enter attendance marks for course " + (i + 1) + " (out of 30): ");
            attendance =sc.nextFloat();
            totalMarks+=attendance;
        }
    }

    public void displayGrades() {
        float percentage = (totalMarks / 1500) * 100;
        String grade;

        if (percentage >= 80) grade = "A+";
        else if (percentage >= 75) grade = "A";
        else if (percentage >= 70) grade = "A-";
        else if (percentage >= 65) grade = "B+";
        else if (percentage >= 60) grade = "B";
        else if (percentage >= 55) grade = "B-";
        else if (percentage >= 50) grade = "C+";
        else if (percentage >= 45) grade = "C";
        else if (percentage >= 40) grade = "D";
        else grade = "F";

        System.out.println("Total Marks: " + totalMarks + " / 1500");
        System.out.println("Grade: " + grade);
    }
}