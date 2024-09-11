
package com.mycompany.lojas_de_discos;


public class Musica {
    private String faixa;
    private String faixaDuracao;
    
    
    public Musica(String faixa, String faixaDuracao){
        setFaixa(faixa);
        setFaixaDuracao(faixaDuracao);
    }

    public String getFaixa() {
        return faixa;
    }

    public void setFaixa(String faixa) {
        if(!faixa.isBlank()){
        this.faixa = faixa;
        }
    }

    public String getFaixaDuracao() {
        return faixaDuracao;
    }

    public void setFaixaDuracao(String faixaDuracao) {
        if(!faixaDuracao.isBlank()){
        this.faixaDuracao = faixaDuracao;
        }
    }
    @Override
    public String toString(){
        String musica = """
                     %s %s
                     """;
        String musicaFormatados = String.format(musica, faixa, faixaDuracao);
        
        return musicaFormatados;
    }
}
