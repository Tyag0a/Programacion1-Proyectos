module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo to javafx.fxml;
    exports co.edu.uniquindio.poo;

    opens co.edu.uniquindio.poo.Controller;
    exports co.edu.uniquindio.poo.Controller;


}
