package br.com.sistemabancario.controladoresdetela;

import br.com.sistemabancario.controladores.ControladorDeCena;
import javafx.fxml.FXML;

import java.io.IOException;

public class ControladorTelaPrincipalAdmin {


    @FXML
    protected void cadastrarClientes() throws IOException {
        System.out.println("Cadastrar Clientes");
        ControladorDeCena.trocarCena("tela-cadastro-clientes");
    }
}
