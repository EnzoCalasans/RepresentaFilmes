package br.com.enzo.filmes.principal;

import br.com.enzo.filmes.calculos.CalculadoraDeTempo;
import br.com.enzo.filmes.calculos.Recomendacao;
import br.com.enzo.filmes.modelos.Episodio;
import br.com.enzo.filmes.modelos.Filme;
import br.com.enzo.filmes.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme:" + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.media());

        Serie serie = new Serie("Lost", 2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar:" + serie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.setDuracaoEmMinutos(200);

        Recomendacao recomendacao = new Recomendacao();
        recomendacao.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizações(300);
        recomendacao.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
    }
}
