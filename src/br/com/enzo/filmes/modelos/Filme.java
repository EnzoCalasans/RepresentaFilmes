package br.com.enzo.filmes.modelos;

import br.com.enzo.filmes.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int ano) {
        super(nome,ano);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) media() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAno() + ")";
    }
}
