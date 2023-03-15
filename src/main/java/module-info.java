module com.example.codingpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codingpractice to javafx.fxml;
    exports com.example.codingpractice;
}