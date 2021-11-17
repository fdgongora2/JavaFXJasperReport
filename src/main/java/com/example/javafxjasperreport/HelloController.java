package com.example.javafxjasperreport;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import net.sf.jasperreports.engine.JRException;

import java.sql.SQLException;

public class HelloController {
    @FXML
    private Label welcomeText;


    @FXML
    public void onImprimirListadoClick(ActionEvent actionEvent) {

        try {
            // --- Show Jasper Report on click-----
            new ReportClientes().showReport();
        } catch (ClassNotFoundException | JRException | SQLException e1) {
            e1.printStackTrace();
        }
    }
}