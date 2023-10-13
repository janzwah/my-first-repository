module com.example.myfirstfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfirstfx to javafx.fxml;
    exports com.example.myfirstfx;
}