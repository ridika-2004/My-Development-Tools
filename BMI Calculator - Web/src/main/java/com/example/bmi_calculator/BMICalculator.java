package com.example.bmi_calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BMICalculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label heightLabel = new Label("Enter your height (in meters):");
        TextField heightInput = new TextField();

        Label weightLabel = new Label("Enter your weight (in kg):");
        TextField weightInput = new TextField();

        Button calculateButton = new Button("Calculate BMI");
        Label resultLabel = new Label("Your BMI will appear here");


        heightLabel.setStyle("-fx-font-size: 14px;");
        weightLabel.setStyle("-fx-font-size: 14px;");
        resultLabel.setStyle("-fx-font-size: 16px; -fx-text-fill: blue;");
        calculateButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 14px;");

        VBox layout = new VBox(10, heightLabel, heightInput, weightLabel, weightInput, calculateButton, resultLabel);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));
        layout.setStyle("-fx-background-color: #f0f0f0;");


        calculateButton.setOnAction(event -> {
            try {
                double height = Double.parseDouble(heightInput.getText());
                double weight = Double.parseDouble(weightInput.getText());

                if (height <= 0 || weight <= 0) {
                    resultLabel.setText("Height and weight must be positive numbers.");
                } else {
                    double bmi = weight / (height * height);
                    resultLabel.setText(String.format("Your BMI is: %.2f", bmi));
                }
            } catch (NumberFormatException e) {
                resultLabel.setText("Please enter valid numeric values.");
            }
        });


        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setTitle("BMI Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}