module com.example.lesson19fxcatform {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson19fxcatform to javafx.fxml;
    exports com.example.lesson19fxcatform;
}