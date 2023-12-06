package org.example;

public class Funcionario {

    private String nome;
    private int quantidadeDeFilhos;

    public Funcionario() {
    }

    public Funcionario(String nome, int quantidadeDeFilhos) {
        this.nome = nome;
        this.quantidadeDeFilhos = quantidadeDeFilhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeFilhos() {
        return quantidadeDeFilhos;
    }

    public void setQuantidadeDeFilhos(int quantidadeDeFilhos) {
        this.quantidadeDeFilhos = quantidadeDeFilhos;
    }

    public boolean hasChildren(){
        return quantidadeDeFilhos >= 1;
    }
}
