package com.mycompany.sistemabancario;

public class Principal {
    
    public static void main(String [] args){
        
        Cliente joao = new Cliente();
        joao.setNome("Joao Cardosas Filho");
        joao.setProfissao("Cientista de Dados");
        joao.setCpf("000.000.000-88");
        
        joao.setCpf("-1");

        Endereco enderecoJoao = new Endereco();
        enderecoJoao.setRua("Jose Alfredo");
        enderecoJoao.setNumero(50);
        enderecoJoao.setNumero(-30);
        enderecoJoao.setCidade("São José");
        enderecoJoao.setCep("88220-000");
        enderecoJoao.setEstado("Santa Catarina");
        
        ContaBancaria contaJoao = new ContaBancaria();
        contaJoao.depositar(150);
        contaJoao.setAgencia("1234-5");
        contaJoao.setNumero("1111-3");
        joao.setConta(contaJoao); 
        joao.setEndereco(enderecoJoao);

        System.out.println("**********************");
        System.out.println(joao);
        System.out.println("**********************");
        
    }
    
}
