package co.edu.uniquindio.poo.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.io.IOException;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CuentaBancariaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCrearCuenta;

    @FXML
    private TextField txApellido;

    @FXML
    private TextField txNombre;

    @FXML
    private TextField txNumeroCuenta;

    @FXML
    private TextField txSaldo;

    @FXML
    private TextField txTipoCuenta;

    @FXML
    void crearCuenta() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    void initialize() {

    }

}
