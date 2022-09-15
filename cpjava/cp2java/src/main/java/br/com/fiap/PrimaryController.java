package br.com.fiap;

import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class PrimaryController {
    @FXML
    private TextField textFieldDadosEquipamento;
    @FXML
    private TextField textFieldDataAbertura;
    @FXML
    private TextField textFieldFuncionarioSolicitante;
    @FXML
    private TextField textFieldDepartamento;
    @FXML
    private TextField textFieldDescricaoProblema;
    @FXML
    private ListView<Chamado> listView;

    private List<Chamado> lista = new ArrayList<>();

    public void salvar() {
        var chamado = carregarChamadoDoFormulario();
        lista.add(chamado);

        mostrarAlerta("Chamado cadastrado com sucesso");

        limparFormulario();

        listView.getItems().add(chamado);
    }

    private void limparFormulario() {

        textFieldDadosEquipamento.setText("");
        textFieldDataAbertura.setText("");
        textFieldFuncionarioSolicitante.setText("");
        textFieldDepartamento.setText("");
        textFieldDescricaoProblema.setText("");
    }

    private Chamado carregarChamadoDoFormulario() {

        String dadosEquipamento = textFieldDadosEquipamento.getText();
        String funcionarioSolicitante = textFieldFuncionarioSolicitante.getText();
        int dataAbertura = Integer.valueOf(textFieldDataAbertura.getText());
        String departamento = textFieldDepartamento.getText();
        String descricaoProblema = textFieldDescricaoProblema.getText();

        Chamado chamado = new Chamado(dadosEquipamento, funcionarioSolicitante, dataAbertura, departamento,
                descricaoProblema);
        return chamado;
    }

    private void mostrarAlerta(String mensagem) {

        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setContentText(mensagem);
        alerta.show();
    }

    public void ordernarPorDepartamento() {
        lista.sort((o1, o2) -> compare(o1.getDepartamento(), o2.getDepartamento()));
        atualizarLista();
    }

    public void ordernarPorDataAbertura() {
        lista.sort((o1, o2) -> Integer.compare(o1.getDataAbertura(), o2.getDataAbertura()));
        atualizarLista();
    }

    public void ordernarPorFuncionario() {
        lista.sort((o1, o2) -> compare(o1.getFuncionarioSolicitante(), o2.getFuncionarioSolicitante()));
        atualizarLista();
    }

    private void atualizarLista() {
        listView.getItems().clear();
        listView.getItems().addAll(lista);
    }

    private int compare(String departamento, String departamento2) {
        return 0;
    }

}
