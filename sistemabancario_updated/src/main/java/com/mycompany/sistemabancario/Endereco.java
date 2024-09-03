
package com.mycompany.sistemabancario;

public class Endereco {    
    String rua;
    int numero;
    String cep;
    String cidade;
    String estado;
    
    @Override 
    public String toString(){        
        String endereco = 
                """ 
            rua: %s
            numero: %d
            cep: %s
            cidade: %s
            estado: %s
            """;
        String enderecoFormatado = String.format(endereco,rua,numero,
                cep, cidade, estado);
        return enderecoFormatado;
    }
    
}
