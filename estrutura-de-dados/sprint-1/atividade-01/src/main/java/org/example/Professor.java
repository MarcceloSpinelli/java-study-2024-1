package org.example;

public class Professor extends Profissional implements IBonus {

    private Integer qtdAula;

    private Double valorHora;

    public Professor(String cpf, String nome, Integer qtdAula, Double valorHora) {
        super(cpf, nome);
        this.qtdAula = qtdAula;
        this.valorHora = valorHora;
    }

    public Integer getQtdAula() {
        return qtdAula;
    }

    public void setQtdAula(Integer qtdAula) {
        this.qtdAula = qtdAula;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public Double calcSalario() {
        return null;
    }

    @Override
    public Double getValorBonus() {
        return null;
    }
}
