package br.com.fiap;

public class Chamado {
    private String dadosEquipamento;
    private String funcionarioSolicitante;
    private int dataAbertura;
    private String departamento;
    private String descricaoProblema;

    public Chamado(String dadosEquipamento, String funcionarioSolicitante, int dataAbertura, String departamento2,
            String descricaoProblema) {
        this.dadosEquipamento = dadosEquipamento;
        this.funcionarioSolicitante = funcionarioSolicitante;
        this.dataAbertura = dataAbertura;
        this.departamento = departamento2;
        this.descricaoProblema = descricaoProblema;
    }

    public String getDadosEquipamento() {
        return dadosEquipamento;
    }

    public void setDadosEquipamento(String dadosEquipamento) {
        this.dadosEquipamento = dadosEquipamento;
    }

    public String getFuncionarioSolicitante() {
        return funcionarioSolicitante;
    }

    public void setFuncionarioSolicitante(String funcionarioSolicitante) {
        this.funcionarioSolicitante = funcionarioSolicitante;
    }

    public int getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(int dataAbertura) {
        this.dataAbertura = dataAbertura;
    }


    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "equipamento: " + dadosEquipamento + "; data: " + dataAbertura + "; departamento: "
                + departamento + "; descriçao do problema: " + descricaoProblema + "; funcionario Solicitante: "
                + funcionarioSolicitante;
    }




}
