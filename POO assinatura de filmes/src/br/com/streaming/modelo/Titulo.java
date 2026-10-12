package br.com.streaming.modelo;

public class Titulo {

  // atributos
  private String nome;
  private int anoDeLancamento;
  private boolean incluidoNoPlano;
  private double avaliacao;
  private int totalDeAvaliacoes;
  private int duracaoEmMinutos;

  // métodos
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getAnoDeLancamento() {
    return anoDeLancamento;
  }

  public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento;
  }

  public boolean isIncluidoNoPlano() {
    return incluidoNoPlano;
  }

  public void setIncluidoNoPlano(boolean incluidoNoPlano) {
    this.incluidoNoPlano = incluidoNoPlano;
  }

  public double getAvaliacao() {
    return avaliacao;
  }

  public void setAvaliacao(double avaliacao) {
    this.avaliacao = avaliacao;
  }

  public int getDuracaoEmMinutos() {
    return duracaoEmMinutos;
  }

  public void setDuracaoEmMinutos(int duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public int getTotalDeAvaliacoes() {
    return totalDeAvaliacoes;
  }

  public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
    this.totalDeAvaliacoes = totalDeAvaliacoes;
  }

//  public void exibeInfo(){
//    System.out.println(diretor);
//
//  }
}
