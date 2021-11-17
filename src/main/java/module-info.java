module com.example.javafxjasperreport {
    requires javafx.controls;
    requires javafx.fxml;
    requires jasperreports;
    requires java.sql;
    requires java.desktop;
    requires org.mariadb.jdbc;


    opens com.example.javafxjasperreport to javafx.fxml;
    exports com.example.javafxjasperreport;
}