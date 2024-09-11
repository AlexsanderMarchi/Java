
package com.mycompany.sistemabancario;

public class Endereco {    
    private String rua;
    private int numero;
    private String cep;
    private String cidade;
    private String estado;

    public void setRua(String rua) { 
        if(!rua.isBlank()){
            this.rua = rua;
        }        
    }

    public void setNumero(int numero) {
        if(numero > 0){
           this.numero = numero;
        }
    }

    public void setCep(String cep) { 
         if (cep.length() == 9 && cep.charAt(5) == '-') {
            this.cep = cep;
        }
    }

    public void setCidade(String cidade) {
        if(!cidade.isBlank()){
           this.cidade = cidade;
        }  
        
    }

    public void setEstado(String estado) {
         if(!estado.isBlank()){
           this.estado = estado;
        }  
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
    
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
