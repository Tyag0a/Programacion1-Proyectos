package co.edu.uniquindio.poo.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
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
    void crearCuenta(ActionEvent event) {
        System.out.println("Cuenta Registrada Correctamente ;D");

    }



    @FXML
    void initialize() {
        assert btnCrearCuenta != null : "fx:id=\"btnCrearCuenta\" was not injected: check your FXML file 'viewCuentaBancaria.fxml'.";
        assert txApellido != null : "fx:id=\"txApellido\" was not injected: check your FXML file 'viewCuentaBancaria.fxml'.";
        assert txNombre != null : "fx:id=\"txNombre\" was not injected: check your FXML file 'viewCuentaBancaria.fxml'.";
        assert txNumeroCuenta != null : "fx:id=\"txNumeroCuenta\" was not injected: check your FXML file 'viewCuentaBancaria.fxml'.";
        assert txSaldo != null : "fx:id=\"txSaldo\" was not injected: check your FXML file 'viewCuentaBancaria.fxml'.";
        assert txTipoCuenta != null : "fx:id=\"txTipoCuenta\" was not injected: check your FXML file 'viewCuentaBancaria.fxml'.";

    }

}

