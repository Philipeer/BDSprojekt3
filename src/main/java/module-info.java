module org.but.projectdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.slf4j;
    requires com.zaxxer.hikari;
    requires java.sql;
    requires bcrypt;
    requires fontawesomefx;
    requires org.controlsfx.controls;
    requires java.desktop;


    opens org.but.feec.javafx to javafx.fxml;
    exports org.but.feec.javafx;
    exports org.but.feec.javafx.controllers;
    opens org.but.feec.javafx.controllers to javafx.fxml;
}