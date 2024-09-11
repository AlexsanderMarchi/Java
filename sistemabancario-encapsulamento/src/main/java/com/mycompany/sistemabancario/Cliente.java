
package com.mycompany.sistemabancario;

public class Cliente {
    
   private String nome;
   private Endereco endereco;
   private String cpf;
   private String profissao;
   private ContaBancaria conta;

    public void setNome(String nome) {
        if(!nome.isBlank()){
           this.nome = nome;
        }  
        
    }

    public void setEndereco(Endereco endereco) {
        if(endereco != null){
           this.endereco = endereco;
        }
    }
    
    public void setConta(ContaBancaria conta) {
        if(conta != null){
            this.conta = conta;
        }        
    }

    public void setCpf(String cpf) { 
        if (cpf.length() == 14 && cpf.charAt(3) == '.' && cpf.charAt(7) == '.' 
                && cpf.charAt(11) == '-') {
            this.cpf = cpf;
        }        
    }

    public void setProfissao(String profissao) {
        if(!profissao.isBlank()){
           this.profissao = profissao;
        } 
        
    }



    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public ContaBancaria getConta() {
        return conta;
    }
   
    @Override
    public String toString(){
        
        String dados = """
                     *** Dados pessoais ***
                       nome: %s
                       cpf: %s
                       profissão: %s
                       *** Dados de endereço ***
                       %s
                       *** Dados conta bancária ***
                       %s
                       """;
        String dadosFormatados =  String.format(dados,nome,cpf, profissao,
                endereco.toString(), conta.toString());
        
        return dadosFormatados;
    }
    
}
