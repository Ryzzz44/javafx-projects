module com.example.numbercounter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.numbercounter to javafx.fxml;
    exports com.example.numbercounter;
    exports com.example.numbercounter.application;
    opens com.example.numbercounter.application to javafx.fxml;
    exports com.example.numbercounter.controller;
    opens com.example.numbercounter.controller to javafx.fxml;
}