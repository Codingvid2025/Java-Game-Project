module random.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens random.demo to javafx.fxml;
    exports random.demo;
}