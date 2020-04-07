module com.fapce.Aula13 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.fapce.Aula13 to javafx.fxml;
    exports com.fapce.Aula13;
}