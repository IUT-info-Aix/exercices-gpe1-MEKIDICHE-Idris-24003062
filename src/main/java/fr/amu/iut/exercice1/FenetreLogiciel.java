package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class FenetreLogiciel extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        // Création du conteneur principal
        BorderPane root = new BorderPane();

        // Création du conteneur correspondant à la ligne de contrôle haut dessus du tableau
        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Edit");
        Menu menu3 = new Menu("Help");
        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);
        root.setTop(menuBar);

        //la gauche
        VBox lesbutton = new VBox();
        lesbutton.setAlignment(Pos.CENTER);
        lesbutton.setSpacing(5);
        Label entrer = new Label("Boutons : ");
        Button buton1 = new Button("Bouton 1");
        Button buton2 = new Button("Bouton 2");
        Button buton3 = new Button("Bouton 3");
        lesbutton.getChildren().addAll(entrer,buton1,buton2,buton3);
        root.setLeft(lesbutton);

        //le centre
        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setHgap(5);
        gridpane.add(new Label("Name:"), 0, 1);
        TextField champ = new TextField();
        champ.setMaxWidth(260);
        gridpane.add(champ, 1, 1);
        gridpane.add(new Label("Email:"), 0, 2);
        TextField champ2 = new TextField();
        champ.setMaxWidth(260);
        gridpane.add(champ2, 1, 2);
        gridpane.add(new Label("Password:"), 0, 3);
        TextField champ3 = new TextField();
        champ.setMaxWidth(260);
        gridpane.add(champ3, 1, 3);
        gridpane.add(new Button("Submit"), 0, 4);
        gridpane.add(new Button("Cancel"), 1, 4);
        root.setCenter(gridpane);

        // Création de la ligne de séparation
        Separator sep = new Separator();
        // Ajout du conteneur à la scene
        Scene scene = new Scene(root);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 600 );
        primaryStage.setHeight( 500 );
        primaryStage.setTitle("VBox and HBox App");

        //le bas
        Label bottom = new Label("Ceci est un label de bas de page");
        HBox bottomBox = new HBox();
        bottomBox.setAlignment(Pos.CENTER);
        bottomBox.getChildren().add(bottom);
        root.setBottom(bottomBox);


        // Affichage de la fenêtre
        primaryStage.show();
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");
    }

    public static void main(String[] args) {
        launch(args);
    }
}

