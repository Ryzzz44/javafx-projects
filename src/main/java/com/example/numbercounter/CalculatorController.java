package com.example.numbercounter;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.text.DecimalFormat;

public class CalculatorController {

    @FXML private TextField tfNumber1;
    @FXML private TextField tfNumber2;

    @FXML private ComboBox<String> cbOperations;

    @FXML private Label lblResult;

    @FXML
    public void initialize(){
        cbOperations.getItems().addAll("+", "-", "*", "/");
    }

    @FXML
    private void compute() {

        double a = Double.parseDouble(tfNumber1.getText());
        double b = Double.parseDouble(tfNumber2.getText());

        String op = cbOperations.getValue();

        double result = 0;

        if (op.equals("+")) result = a + b;
        else if (op.equals("-")) result = a - b;
        else if (op.equals("*")) result = a * b;
        else if (op.equals("/")) result = a / b;

        DecimalFormat df = new DecimalFormat("0.00");

        lblResult.setText(df.format(result));
    }
}