module com.example.desafiossenac {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.desafiossenac to javafx.fxml;
    exports com.example.desafiossenac;
}