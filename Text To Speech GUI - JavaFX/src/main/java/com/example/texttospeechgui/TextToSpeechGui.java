package com.example.texttospeechgui;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import static javafx.geometry.Pos.CENTER;
import static javafx.geometry.Pos.TOP_CENTER;

public class TextToSpeechGui extends Application {

    private static final int app_width = 375;
    private static final int app_height = 475;

    private TextArea textArea;
    private ComboBox<String> voices, rates, volumes;

    @Override
    public void start(Stage stage) {
        Scene scene = createScene();
        stage.setTitle("Text-To-Speech App");
        stage.setScene(scene);
        stage.show();
    }

    private Scene createScene() {
        VBox vBox = new VBox();
        vBox.setAlignment(TOP_CENTER);

        // Title Label
        Label textToSpeechLabel = new Label("Text To Speech");
        textToSpeechLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #3498db;");
        vBox.getChildren().add(textToSpeechLabel);

        // Text Area
        textArea = new TextArea();
        textArea.setWrapText(true);
        StackPane textAreaPane = new StackPane();
        textAreaPane.setPadding(new Insets(10, 15, 10, 15));
        textAreaPane.getChildren().add(textArea);
        vBox.getChildren().add(textAreaPane);

        // Add setting components
        vBox.getChildren().add(createSettingComponents());

        VBox.setMargin(createImageButton(), new Insets(15, 0, 10, 0));  // Add margin to the "Speak" button

        // Speak Button
        Button speakButton = createImageButton();
        speakButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String msg = textArea.getText();
                String voice = voices.getValue();
                String rate = rates.getValue();
                String volume = volumes.getValue();

                TextToSpeechController.speak(msg,voice,rate,volume);
            }
        });
        vBox.getChildren().add(speakButton);

        speakButton.setOnMousePressed(e -> {speakButton.setStyle("-fx-font-size: 10px; -fx-text-fill: #000000; -fx-background-color: #95a5a6;");});
        speakButton.setOnMouseReleased(e -> {speakButton.setStyle("-fx-font-size: 10px; -fx-text-fill: #000000; -fx-background-color: #FFFFFF;");});

        return new Scene(vBox, app_width, app_height);
    }

    private Button createImageButton() {
        Button button = new Button("Speak");
        button.setStyle("-fx-font-size: 10px; -fx-text-fill: #000000;");
        button.setMaxWidth(Double.MAX_VALUE);
        button.setAlignment(CENTER);

        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("speak.png")));
        imageView.setFitHeight(50);
        imageView.setFitWidth(50);

        button.setGraphic(imageView);

        return button;
    }

    private GridPane createSettingComponents() {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(40);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));

        Label voiceLabel = new Label("Voice");
        voiceLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #3498db;");
        Label rateLabel = new Label("Rate");
        rateLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #3498db;");
        Label volumeLabel = new Label("Volume");
        volumeLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #3498db;");

        gridPane.add(voiceLabel, 0, 0);
        gridPane.add(rateLabel, 1, 0);
        gridPane.add(volumeLabel, 2, 0);

        gridPane.setHalignment(voiceLabel, HPos.CENTER);
        gridPane.setHalignment(rateLabel, HPos.CENTER);
        gridPane.setHalignment(volumeLabel, HPos.CENTER);

        voices = new ComboBox<>();
        voices.getItems().addAll(TextToSpeechController.getVoices());
        voices.setValue(voices.getItems().get(0));

        rates = new ComboBox<>();
        rates.getItems().addAll(TextToSpeechController.getSpeedRates());
        rates.setValue(rates.getItems().get(0));

        volumes = new ComboBox<>();
        volumes.getItems().addAll(TextToSpeechController.getVolumeLevels());
        volumes.setValue(volumes.getItems().get(0));

        gridPane.add(voices, 0, 1);
        gridPane.add(rates, 1, 1);
        gridPane.add(volumes, 2, 1);

        gridPane.setAlignment(CENTER);
        return gridPane;
    }

    public static void main(String[] args) {
        launch();
    }
}


