
package com.mycompany.sistemabancario;

public class Cliente {
    
    String nome;
    Endereco endereco;
    private String cpf;
    String profissao;
    ContaBancaria conta;
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String novoCpf){
        if (novoCpf.length() == 12 && novoCpf.charAt(9) == '-') {
        cpf = novoCpf;
        }
    }
    
}
