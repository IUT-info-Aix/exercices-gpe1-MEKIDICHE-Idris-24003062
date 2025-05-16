package a.d;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SiteController {

    @FXML
    private TextField searchField;

    @FXML
    private Button searchButton;

    @FXML
    private void initialize() {
        // Initialisation du contrôleur
        searchField.setPromptText("Ex. Wifi, SIFAC, impression...");
    }

    @FXML
    private void handleSearch(MouseEvent event) {
        // Gestion de la recherche
        System.out.println("Recherche: " + searchField.getText());
    }

    @FXML
    private void handleCategoryClick(MouseEvent event) {
        // Gestion des clics sur les catégories
        Button source = (Button) event.getSource();
        System.out.println("Catégorie sélectionnée: " + source.getId());
    }

    @FXML
    private void handleMenuClick(MouseEvent event) {
        // Gestion des clics sur les éléments du menu
        System.out.println("Menu sélectionné");
    }
}