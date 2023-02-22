module com.example.ogo_da_velha {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ogo_da_velha to javafx.fxml;
    exports com.example.ogo_da_velha;
}