package br.com.detinho.demos.cicdpeta;

public class Retorno {

    private final String nome;
    private final long idade;
    private final String profissao;

    public Retorno(String nome, long idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public long getIdade() {
        return idade;
    }

    public String getProfissao() {
        return profissao;
    }
}
