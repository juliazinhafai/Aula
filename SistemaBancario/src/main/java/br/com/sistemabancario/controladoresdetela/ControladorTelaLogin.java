package br.com.sistemabancario.controladoresdetela;

import br.com.sistemabancario.controladores.ControladorDeCena;
import br.com.sistemabancario.controladores.ControladorLogin;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ControladorTelaLogin {

    @FXML
    private TextField inputUsuario;

    @FXML
    private PasswordField inputSenha;

    @FXML
    protected void entrarNoSistema() throws IOException {
        String usuario = inputUsuario.getText();
        String senha = inputSenha.getText();

        ControladorLogin controladorLogin = new ControladorLogin();

        if(controladorLogin.entrarNoSistema(usuario, senha)){
            ControladorDeCena.trocarCena("tela-principal-admin.fxml");
        }else {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Erro");
            alerta.setHeaderText("Erro ao realizar login");
            alerta.setContentText("Usuário e/ou senha inválidos");
            alerta.show();
        }
    }
}
