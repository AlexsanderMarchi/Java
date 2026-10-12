package br.com.streaming.modelo;

// Filme e Serie herdam Titulo
public class Serie extends Titulo implements Classificavel {

  private int temporadas;
  private int episodiosPorTemporada;
  private boolean ativa;
  private int duracaoEmMinutosPorEpisodio;

  public boolean isAtiva() {
    return ativa;
  }

  public void setAtiva(boolean ativa) {
    this.ativa = ativa;
  }

  public int getTemporadas() {
    return temporadas;
  }

  public void setTemporadas(int temporadas) {
    this.temporadas = temporadas;
  }

  public int getEpisodiosPorTemporada() {
    return episodiosPorTemporada;
  }

  public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
    this.episodiosPorTemporada = episodiosPorTemporada;
  }

  public int getDuracaoEmMinutosPorEpisodio() {
    return duracaoEmMinutosPorEpisodio;
  }

  public void setDuracaoEmMinutosPorEpisodio(int duracaoEmMinutosPorEpisodio) {
    this.duracaoEmMinutosPorEpisodio = duracaoEmMinutosPorEpisodio;
  }

  // subscreve o método da classe Titulo
  @Override
  public int getDuracaoEmMinutos() {
    return temporadas * episodiosPorTemporada * duracaoEmMinutosPorEpisodio;
  }

  @Override
  public int getClassificacao() {
    return 16;
  }
}
