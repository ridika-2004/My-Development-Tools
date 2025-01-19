module com.example.bmi_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bmi_calculator to javafx.fxml;
    exports com.example.bmi_calculator;
}