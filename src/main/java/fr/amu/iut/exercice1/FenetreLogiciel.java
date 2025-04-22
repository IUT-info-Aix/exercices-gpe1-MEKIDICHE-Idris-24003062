package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class FenetreLogiciel extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        // Création du conteneur principal
        BorderPane root = new BorderPane();

        // Création du conteneur correspondant à la ligne de contrôle haut dessus du tableau
        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Options");
        Menu menu3 = new Menu("Help");
        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);
        root.setTop(menuBar);

        VBox lesbutton = new VBox();
        Label entrer = new Label("Bouton : ");
        Button buton1 = new Button("Bouton 1");
        Button buton2 = new Button("Bouton 2");
        Button buton3 = new Button("Bouton 3");
        lesbutton.getChildren().addAll(entrer,buton1,buton2,buton3);
        root.setLeft(lesbutton);

        TableView<Object> tblCustomers = new TableView<>();
        Label label = new Label("Nom : ");
        TextField champ = new TextField();
        milieu.getChildren().addAll(entrer,buton1,buton2,buton3);
        root.setCenter(milieu);

        // Création de la ligne de séparation
        Separator sep = new Separator();
        // Ajout du conteneur à la scene
        Scene scene = new Scene(root);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("VBox and HBox App");

        // Affichage de la fenêtre
        primaryStage.show();
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");
    }

    public static void main(String[] args) {
        launch(args);
    }
}

