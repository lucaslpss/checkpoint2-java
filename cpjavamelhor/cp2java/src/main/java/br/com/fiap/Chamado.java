package br.com.fiap;

public class Chamado {
    private String dadosEquipamento;
    private String funcionarioSolicitante;
    private int dataAbertura;
    private String departamento;
    private String descricaoProblema;
    private int idChamado;
    private String aberto;
    private String fechado;

    
    public String getAberto() {
        return aberto;
    }

    public void setAberto(String aberto) {
        this.aberto = aberto;
    }

    public String getFechado() {
        return fechado;
    }

    public void setFechado(String fechado) {
        this.fechado = fechado;
    }

    public Chamado(String dadosEquipamento, String funcionarioSolicitante, int dataAbertura, String departamento,
            String descricaoProblema, int idChamado) {
        this.dadosEquipamento = dadosEquipamento;
        this.funcionarioSolicitante = funcionarioSolicitante;
        this.dataAbertura = dataAbertura;
        this.departamento = departamento;
        this.descricaoProblema = descricaoProblema;
        this.idChamado = idChamado;
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

    public int getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(int idChamado) {
        this.idChamado = idChamado;
    }

    @Override
    public String toString() {
        return "Equipamento: " + dadosEquipamento + "; Data: " + dataAbertura + "; Departamento: "
                + departamento + "; Descriçao do problema: " + descricaoProblema + "; Funcionario Solicitante: "
                + funcionarioSolicitante + "; ID do chamado: " + idChamado;
    }

    public Object compareTo(Chamado o2) {
        return null;
    }

}
