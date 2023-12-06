package org.example;

public class FolhaPagamento {
    public FolhaPagamento() {
    }

    Holerite calcularSalario(int qntHoraNormal,
                           int qntHoraExtra,
                           ContratoTrabalho contrato) {
        double pagamentoHoraExtra = qntHoraExtra * contrato.getValorHoraExtra();
        double pagamentoHoraNormal = qntHoraNormal * contrato.getValorHoraNormal();

        Holerite holerite = new Holerite();
        holerite.setFuncionario(contrato.getFuncionario());
        holerite.setValorTotalNormal(pagamentoHoraNormal);
        holerite.setValorTotalExtra(pagamentoHoraExtra);
        holerite.setValorAdicionalFilhos(0);

        if(contrato.hasChildrenAditionalFee()){
            holerite.setValorAdicionalFilhos((pagamentoHoraNormal + pagamentoHoraExtra) * 0.10);
            return holerite;
        }
        return holerite;
    }
}
