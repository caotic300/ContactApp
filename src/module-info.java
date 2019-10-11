module ContactApp {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.xml;

    opens com.ContactApp;
    opens com.ContactApp.datamodel;
}

