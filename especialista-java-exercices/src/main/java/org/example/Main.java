package org.example;

public class Main {
    public static void main(String[] args) {
        var folhaPagamento = new FolhaPagamento();
        System.out.println(folhaPagamento.calcularSalario(
            40,
            5,
            10.00,
            20.00));
    }
}
