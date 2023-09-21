module com.example.desafiossenac {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.desafiosSenac to javafx.fxml;
    exports com.desafiosSenac;
}