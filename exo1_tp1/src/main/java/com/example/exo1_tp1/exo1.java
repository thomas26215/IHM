package com.example.exo1_tp1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

// extension de la classe Application pour créer une application JavaFX
public class exo1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    // Méthode d’initialisation de la scène
    public void start(Stage primaryStage) {
        // définition de la fenêtre (taille, et titre)
        primaryStage.setWidth(500);
        primaryStage.setHeight(300);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Fenêtre JavaFX");

        // définition d’un conteneur VBox qui arrange les sous-composants sur une seule
        // colonne.
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);

        // définition d’un texte
        Text text = new Text("Exemple de Code Java pur");
        text.setFill(Color.BROWN);
        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

        // Ajout du texte dans le conteneur vbox
        vbox.setMargin(text, new Insets(20, 50, 20, 50));
        vbox.getChildren().addAll(text);

        // Ajout de saisie de texte
        TextField textField = new TextField();
        vbox.getChildren().addAll(textField);

        // Ajout d’un bouton dans le conteneur vbox
        Button button = new Button("Compris !");
        vbox.getChildren().addAll(button);

        // spécification de la scène avec la Vbox
        primaryStage.setScene(new Scene(vbox));

        // Ajout de boutons radios
        RadioButton javaFXButton = new RadioButton("JavaFX");
        RadioButton swingButton = new RadioButton("Swing");
        RadioButton autreButton = new RadioButton("Autre");

        // Ajout des boutons radio avec la Vbox
        vbox.getChildren().addAll(javaFXButton, swingButton, autreButton);

        // Regroupement des boutons radio
        ToggleGroup toogleGroupe = new ToggleGroup();
        javaFXButton.setToggleGroup(toogleGroupe);
        swingButton.setToggleGroup(toogleGroupe);
        autreButton.setToggleGroup(toogleGroupe);

        // rendre la fenêtre visible
        primaryStage.show();
    }
}
