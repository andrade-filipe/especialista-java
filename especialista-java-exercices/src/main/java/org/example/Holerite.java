package org.example;

public class Holerite {
    private Funcionario funcionario;
    private double valorTotalNormal;
    private double valorTotalExtra;
    private double valorAdicionalFilhos;

    public Holerite() {
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorTotalNormal() {
        return valorTotalNormal;
    }

    public void setValorTotalNormal(double valorTotalNormal) {
        this.valorTotalNormal = valorTotalNormal;
    }

    public double getValorTotalExtra() {
        return valorTotalExtra;
    }

    public void setValorTotalExtra(double valorTotalExtra) {
        this.valorTotalExtra = valorTotalExtra;
    }

    public double getValorAdicionalFilhos() {
        return valorAdicionalFilhos;
    }

    public void setValorAdicionalFilhos(double valorAdicionalFilhos) {
        this.valorAdicionalFilhos = valorAdicionalFilhos;
    }

    public double calcularTotal(){
        return valorTotalExtra + valorTotalNormal + valorAdicionalFilhos;
    }

    @Override
    public String toString() {
        return "Holerite{" + "\n" +
            "funcionario=" + funcionario.toString() + "\n" +
            "valorTotalNormal=" + valorTotalNormal + "\n" +
            "valorTotalExtra=" + valorTotalExtra + "\n" +
            "valorAdicionalFilhos=" + valorAdicionalFilhos + "\n" +
            "valorTotal=" + calcularTotal() + "\n" +
            '}';
    }
}
