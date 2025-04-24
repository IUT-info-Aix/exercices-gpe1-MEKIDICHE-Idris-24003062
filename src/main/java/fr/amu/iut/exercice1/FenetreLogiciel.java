package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import static java.awt.SystemColor.menu;

public class FenetreLogiciel extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        // Création du conteneur principal
        BorderPane root = new BorderPane();

        // Création du Menu "File" avec les sous-items
        Menu menu1 = new Menu("File");
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem closeItem = new MenuItem("Close");
        menu1.getItems().addAll(newItem, openItem, saveItem, closeItem);

        Menu menu2 = new Menu("Edit");
        MenuItem cutItem = new MenuItem("Cut");
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");
        menu2.getItems().addAll(cutItem, copyItem, pasteItem);

        Menu menu3 = new Menu("Help");
        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);
        root.setTop(menuBar);

        // Création des boutons à gauche
        VBox lesbutton = new VBox();
        lesbutton.setAlignment(Pos.CENTER);
        lesbutton.setSpacing(6);
        Label entrer = new Label("Boutons : ");
        Button buton1 = new Button("Bouton 1");
        Button buton2 = new Button("Bouton 2");
        Button buton3 = new Button("Bouton 3");

        lesbutton.getChildren().addAll(entrer, buton1, buton2, buton3);
        root.setLeft(lesbutton);

        // Créer le GridPane pour le centre avec un alignement centré
        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.CENTER); // Centrer le GridPane dans la fenêtre
        gridpane.add(new Label("Name:"), 0, 1);
        TextField champ = new TextField();
        champ.setMaxWidth(260);
        gridpane.add(champ, 1, 1);
        gridpane.add(new Label("Email:"), 0, 2);
        TextField champ2 = new TextField();
        champ2.setMaxWidth(260);
        gridpane.add(champ2, 1, 2);
        gridpane.add(new Label("Password:"), 0, 3);
        TextField champ3 = new TextField();
        champ3.setMaxWidth(260);
        gridpane.add(champ3, 1, 3);
        gridpane.add(new Button("Submit"), 0, 4);
        gridpane.add(new Button("Cancel"), 1, 4);
        Separator sepVert = new Separator(Orientation.VERTICAL);
        sepVert.setPadding(new Insets(0, 10, 0, 10));

        // HBox combinant la colonne de boutons et le formulaire
        HBox hBoxCenter = new HBox(lesbutton, sepVert, gridpane);
        hBoxCenter.setAlignment(Pos.BOTTOM_CENTER);
        hBoxCenter.setSpacing(10);

        root.setCenter(hBoxCenter);

        // Création de la scène
        Scene scene = new Scene(root);

        // Paramètres de la fenêtre
        primaryStage.setScene(scene);
        primaryStage.setWidth(700);
        primaryStage.setHeight(600);
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");

        // Le bas
        Separator sepHoriz = new Separator(Orientation.HORIZONTAL);
        Label bottomLabel = new Label("Ceci est un label de bas de page");
        HBox bottomBox = new HBox(bottomLabel);
        bottomBox.setAlignment(Pos.CENTER);
        bottomBox.setPadding(new Insets(10));

        // On met le séparateur et le label dans une VBox, puis on le place en bas
        VBox bottomContainer = new VBox(sepHoriz, bottomBox);
        root.setBottom(bottomContainer);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
