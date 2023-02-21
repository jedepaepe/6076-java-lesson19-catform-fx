package com.example.lesson19fxcatform;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.time.LocalDate;

public class CatForm extends Application {
    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(15));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        int line = 0;

        Label titleLabel = new Label("Formulaire d'encodage d'un chat");
        GridPane.setHalignment(titleLabel, HPos.CENTER);
        gridPane.add(titleLabel, 0, line++, 2, 1);

        Label breedLabel = new Label("Race");
        GridPane.setHalignment(breedLabel, HPos.RIGHT);
        gridPane.add(breedLabel, 0, line);
        TextField breedTextField = new TextField();
        gridPane.add(breedTextField, 1, line++);

        Label birthLabel = new Label("Date de naissance");
        GridPane.setHalignment(birthLabel, HPos.RIGHT);
        gridPane.add(birthLabel, 0, line);
        TextField birthTextField = new TextField();
        birthTextField.setPromptText("2020-04-29");
        gridPane.add(birthTextField, 1, line++);

        Label weightLabel = new Label("Poids");
        GridPane.setHalignment(weightLabel, HPos.RIGHT);
        gridPane.add(weightLabel, 0, line);
        TextField weightTextField = new TextField();
        gridPane.add(weightTextField, 1, line++);

        Label sizeLabel = new Label("Taille");
        GridPane.setHalignment(sizeLabel, HPos.RIGHT);
        gridPane.add(sizeLabel, 0, line);
        TextField sizeTextField = new TextField();
        gridPane.add(sizeTextField, 1, line++);

        Label colorsLabel = new Label("Couleurs");
        GridPane.setHalignment(colorsLabel, HPos.RIGHT);
        gridPane.add(colorsLabel, 0, line);
        TextField colorsTextField = new TextField();
        gridPane.add(colorsTextField, 1, line++);

        Button closeButton = new Button("Fermer");
        gridPane.add(closeButton, 0, line);
        Button saveButton = new Button("Sauver");
        gridPane.add(saveButton, 1, line);

        closeButton.setOnAction(event -> stage.close());

        saveButton.setOnAction(event -> {
            Cat cat = new Cat();
            cat.setBreed(breedTextField.getText());
            cat.setBirth(LocalDate.parse(birthTextField.getText()));
            cat.setWeight(Double.parseDouble(weightTextField.getText()));
            cat.setSize(Double.parseDouble(sizeTextField.getText()));
            cat.setColors(colorsTextField.getText().split(" "));

            CatWriter catWriter = null;
            try {
                catWriter = new CatWriter();
                catWriter.write(cat);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                if (catWriter != null) {
                    catWriter.close();
                }
            }
        });

        stage.setScene(new Scene(gridPane));
        stage.setTitle("formulaire chat");
        stage.show();
    }
}
