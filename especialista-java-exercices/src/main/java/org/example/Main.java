package org.example;

public class Main {
    public static void main(String[] args) {
        var folhaPagamento = new FolhaPagamento();
        var funcionario = new Funcionario("Filipe", 5);
        var contrato = new ContratoTrabalho(funcionario, 10.0, 20.0);
        System.out.println(folhaPagamento.calcularSalario(
            40,
            5,
            contrato));
    }
}
