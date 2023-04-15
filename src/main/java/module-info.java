module com.example.tok {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tok to javafx.fxml;
    exports com.example.tok;
}