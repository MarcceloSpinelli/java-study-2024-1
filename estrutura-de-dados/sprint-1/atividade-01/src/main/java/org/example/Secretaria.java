package org.example;

public class Secretaria extends Profissional{

    private Double salario, extra;

    public Secretaria(String cpf, String nome, Double salario, Double extra) {
        super(cpf, nome);
        this.salario = salario;
        this.extra = extra;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getExtra() {
        return extra;
    }

    public void setExtra(Double extra) {
        this.extra = extra;
    }

    @Override
    public Double calcSalario() {
        return null;
    }
}
