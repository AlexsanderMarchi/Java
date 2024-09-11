package com.mycompany.lojas_de_discos;

import java.util.List;

public class Album {
    private String nomeAlbum;
    private int anoLancamento;
    private Artista artista;
    private List <Musica> musicas;

    
     public Album(String nomeAlbum,int anoLancamento, Artista artista, 
             List <Musica> musicas){
         setNomeAlbum(nomeAlbum);
         setAnoLancamento(anoLancamento);
         setArtista(artista);
         this.musicas = musicas;
         
     }
     
     
    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    
    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        if(artista != null){
        this.artista = artista;
        }
    }

    public void addMusicas(Musica musicas) {
        this.musicas.add(musicas);
    }
    
     @Override 
    public String toString(){        
        String album = 
                """ 
            ************ Album ************
            Nome: %s
            Ano de Lançamento: %s
            Artista: %s
            Faixas: \n
            """;
        for(int i = 0; i<musicas.size(); i++){
           Musica faixa = musicas.get(i);
           album += (i+1) + ". " + faixa.toString();
       }
        String albumFormatado = String.format(album, nomeAlbum, anoLancamento,  artista);
        return albumFormatado;
    }
}
