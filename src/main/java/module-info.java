module com.example.binoxxosolver {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.company.binoxxosolver to javafx.fxml;
    exports com.company.binoxxosolver;
}