package org.example;

public class FolhaPagamento {
    public FolhaPagamento() {
    }

    double calcularSalario(int qntHoraNormal,
                           int qntHoraExtra,
                           ContratoTrabalho contrato) {
        double pagamentoHoraExtra = qntHoraExtra * contrato.getValorHoraExtra();
        double pagamentoHoraNormal = qntHoraNormal * contrato.getValorHoraNormal();
        if(contrato.hasChildrenAditionalFee()){
            return (pagamentoHoraNormal + pagamentoHoraExtra) * 1.10;
        }
        return pagamentoHoraNormal + pagamentoHoraExtra;
    }
}
