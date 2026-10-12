package br.com.streaming.modelo;

public class FiltroRecomendacao {

  public void filtra(Classificavel classificavel){

    if (classificavel.getClassificacao() == 16) {
      System.out.println("Episodio/Serie classificavel");
    } else {
      System.out.println("Filme classificavel");
    }

  }

}

