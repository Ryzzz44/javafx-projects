package com.example.numbercounter;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.text.DecimalFormat;

public class FoodOrderController {

    @FXML private CheckBox cpizza;
    @FXML private CheckBox cburger;
    @FXML private CheckBox csoftDrinks;
    @FXML private CheckBox ctea;
    @FXML private CheckBox csundae;

    @FXML private RadioButton rbNone;
    @FXML private RadioButton rb5;
    @FXML private RadioButton rb10;
    @FXML private RadioButton rb15;

    @FXML private ToggleGroup discountGroup;

    @FXML
    private void btnOrder() {

        double total = 0;

        if (cpizza.isSelected()) total += 100;
        if (cburger.isSelected()) total += 80;
        if (csoftDrinks.isSelected()) total += 55;
        if (ctea.isSelected()) total += 50;
        if (csundae.isSelected()) total += 40;

        double discount = 0;

        if (rb5.isSelected()) discount = 0.05;
        else if (rb10.isSelected()) discount = 0.10;
        else if (rb15.isSelected()) discount = 0.15;

        double finalTotal = total - (total * discount);

        DecimalFormat df = new DecimalFormat("0.00");

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Food Ordering System");
        alert.setHeaderText(null);
        alert.setContentText("The total price is Php " + df.format(finalTotal));
        alert.showAndWait();
    }
}