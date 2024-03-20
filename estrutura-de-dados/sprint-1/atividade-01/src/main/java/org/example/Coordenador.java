package org.example;

public class Coordenador extends Profissional implements IBonus {

    private Integer qtdHoraCoordenacao;

    private Double valorHoraCoordenacao;

    public Integer getQtdHoraCoordenacao() {
        return qtdHoraCoordenacao;
    }

    public Coordenador(String cpf, String nome, Integer qtdHoraCoordenacao, Double valorHoraCoordenacao) {
        super(cpf, nome);
        this.qtdHoraCoordenacao = qtdHoraCoordenacao;
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    public void setQtdHoraCoordenacao(Integer qtdHoraCoordenacao) {
        this.qtdHoraCoordenacao = qtdHoraCoordenacao;
    }

    public Double getValorHoraCoordenacao() {
        return valorHoraCoordenacao;
    }

    public void setValorHoraCoordenacao(Double valorHoraCoordenacao) {
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    @Override
    public Double getValorBonus() {
        return null;
    }

    @Override
    public Double calcSalario() {
        return null;
    }
}
