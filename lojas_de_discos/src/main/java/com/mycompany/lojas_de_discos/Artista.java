
package com.mycompany.lojas_de_discos;


public class Artista {
    private String nomeArtista;
    private String anosDeAtividade;

    public Artista(String nomeArtista, String anosDeAtividade){
        setNomeArtista(nomeArtista);
        setAnosDeAtividade(anosDeAtividade);
    }
    
    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        if(!nomeArtista.isBlank()){
        this.nomeArtista = nomeArtista;
        }  
    }

    public String getAnosDeAtividade() {
        return anosDeAtividade;
    }

    public void setAnosDeAtividade(String anosDeAtividade) {
        this.anosDeAtividade = anosDeAtividade;    
    }
 
     @Override 
    public String toString(){        
        String artista = 
                """ 
            %s (%s)
            """;
        String artistaFormatado = String.format(artista,nomeArtista, anosDeAtividade);
        return artistaFormatado;
    }
}
