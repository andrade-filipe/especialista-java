package org.example.desafio525;

public class Main {
    public static void main(String[] args) {
        var folhaPagamento = new FolhaPagamento();
        var funcionario = new Funcionario("Filipe", 5);
        var contrato = new ContratoTrabalho(funcionario, 10.0, 20.0);
        Holerite holerite = folhaPagamento.calcularSalario(40, 5, contrato);
        System.out.println(holerite.toString());
    }
}
