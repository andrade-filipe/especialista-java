package org.example;

public class FolhaPagamento {
    double calcularSalario(int qntHoraNormal,
                           int qntHoraExtra,
                           double valorHoraNormal,
                           double valorHoraExtra) {
        double pagamentoHoraExtra = qntHoraExtra * valorHoraExtra;
        double pagamentoHoraNormal = qntHoraNormal * valorHoraNormal;
        return pagamentoHoraNormal + pagamentoHoraExtra;
    }
}
