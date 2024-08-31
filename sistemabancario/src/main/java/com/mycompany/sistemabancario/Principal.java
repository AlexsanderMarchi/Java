package com.mycompany.sistemabancario;

public class Principal {
    
    public static void main(String [] args){
        
        Cliente joao = new Cliente();
        joao.nome = "Joao Cardosas Filho";
        joao.profissao = "Cientista de Dados";
        joao.cpf = "00088822211-56";
        Endereco enderecoJoao = new Endereco();
        enderecoJoao.rua = "Jose Alfredo";
        enderecoJoao.numero = 30;
        enderecoJoao.cidade =  "São José";
        enderecoJoao.cep = "88220-000";    
        enderecoJoao.estado = "Santa Catarina";
        ContaBancaria contaJoao = new ContaBancaria();
        joao.conta = contaJoao;
        joao.endereco = enderecoJoao;
        System.out.println("**********************");
        System.out.println(joao.endereco);
        System.out.println("**********************");
        
        Cliente ana = new Cliente();
        ContaBancaria contaAna = new ContaBancaria();
        ana.conta = contaAna;
        //contaAna.set = 100;
        //contaJoao.saldo = -50;
        contaJoao.setAgencia("1000-0");
        contaJoao.setNumero("2000-0");
        System.out.println("agencia joao: " + contaJoao.getAgencia());
        System.out.println("numero joao: " + contaJoao.getNumero());
        
        System.out.println("Saldo joao anterior: " + joao.conta.getSaldo());
        System.out.println("Saldo ana anterior: " + ana.conta.getSaldo());
        contaJoao.transferir(100, contaAna);
         System.out.println("Saldo joao depois: " + contaJoao.getSaldo());
        System.out.println("Saldo ana depois: " + contaAna.getSaldo());
        
        
        /*contaJoao.numero = "123-3";
        contaJoao.agencia = "000111222";
        System.out.println("saldo da ana = " + contaJoao.saldo);
        System.out.println("agencia da ana = " + contaJoao.agencia);
        System.out.println("numero da conta = " + contaJoao.numero);
        contaJoao.depositar(150);
        System.out.println("saldo da ana = " + contaJoao.saldo);
        boolean sacou = contaJoao.sacar(50);
        if(sacou == true){
            System.out.println("saque realizado com sucesso");
            System.out.println("saldo da ana = " + contaJoao.saldo);
        }else {
            System.out.println("saque NÃO realizado com sucesso");
        }*/
        
    }
    
}
