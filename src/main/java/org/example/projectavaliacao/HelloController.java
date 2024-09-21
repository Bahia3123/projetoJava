package org.example.projectavaliacao;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {


    @FXML
    private ToggleGroup brabo;

    @FXML
    private Label lblSaldo;

    @FXML
    private RadioButton rbCorrente;


    @FXML
    private RadioButton rbEspecial;

    @FXML
    private RadioButton rbPoupanca;

    @FXML
    private TextField txtConta;

    @FXML
    private TextArea txtDados;

    @FXML
    private TextField txtDepositarSacar;

    @FXML
    private TextField txtLimite;

    @FXML
    private TextField txtPesquisa;

    @FXML
    private TextField txtTitular;

    @FXML
    private TextField txtVencimento;

    @FXML
    protected  void onSelecionarTipo() {
        if (rbCorrente.isSelected()) {
            txtLimite.setDisable(true);
            txtVencimento.setDisable(true);
        } else if (rbEspecial.isSelected()) {
            txtLimite.setDisable(false);
            txtVencimento.setDisable(true);

        } else {
            txtLimite.setDisable(true);
            txtVencimento.setDisable(false);
        }


    }
}