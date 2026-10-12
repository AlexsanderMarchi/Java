import br.com.streaming.modelo.Filme;
import br.com.streaming.modelo.FiltroRecomendacao;
import br.com.streaming.modelo.Serie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
      Filme filmeFavorito = new Filme();
      filmeFavorito.setDiretor("Tarantino");
      filmeFavorito.setNome("Pulp fiction");
      filmeFavorito.setAnoDeLancamento(1994);

    Serie serieFavorita = new Serie();
    serieFavorita.setTemporadas(9);
    serieFavorita.setNome("The Office");
    serieFavorita.setAtiva(false);
    serieFavorita.setEpisodiosPorTemporada(24);
    serieFavorita.setDuracaoEmMinutosPorEpisodio(22);

//      filmeFavorito.exibeInfo();
    System.out.println("Filme: " + filmeFavorito.getNome() + "\n - Diretor: " + filmeFavorito.getDiretor());
    System.out.println("Serie: " + serieFavorita.getNome() + "\n - Temporadas: " + serieFavorita.getTemporadas()
        + "\n - Duracao em minutos para finalizar: "
        + serieFavorita.getDuracaoEmMinutos());

    FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
    filtroRecomendacao.filtra(filmeFavorito);
    filtroRecomendacao.filtra(serieFavorita);

  }
}