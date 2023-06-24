module com.example.modularsnowman {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.modularsnowman to javafx.fxml;
    exports com.example.modularsnowman;
}