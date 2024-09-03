package com.mycompany.sistemabancario;

public class Principal {
    
    public static void main(String [] args){
        
        //Definindo os clientes João e Ana
        Cliente joao = new Cliente();
        joao.nome = "Joao Cardosas Filho";
        joao.profissao = "Cientista de Dados";
        joao.cpf = "00088822211-56";
        
        Cliente ana = new Cliente();
        ana.nome = "Ana Taylor";
        ana.profissao = "Professora de inglês";
        ana.cpf = "888777666-56";
        
        //Definindo endereço de João e Ana
        Endereco enderecoJoao = new Endereco();
        enderecoJoao.rua = "Jose Alfredo";
        enderecoJoao.numero = 30;
        enderecoJoao.cidade =  "São José";
        enderecoJoao.cep = "88220-000";    
        enderecoJoao.estado = "Santa Catarina";
        joao.endereco = enderecoJoao;
        
        Endereco enderecoAna = new Endereco();
        enderecoAna.rua = "Rua Doutor James";
        enderecoAna.numero = 51;
        enderecoAna.cidade = "Xique Xique";
        enderecoAna.cep = "99988877666-55";
        enderecoAna.estado = "Bahia";
        ana.endereco = enderecoAna;
        
        //Printando as Classes Endereco
        System.out.println("**********************");
        System.out.println(joao.nome);
        System.out.println(joao.endereco);
        System.out.println("**********************");
        System.out.println(ana.nome);
        System.out.println(ana.endereco);
        System.out.println("**********************");
        
        //Definindo Contas Bancarias de Joao e Ana
        ContaBancaria contaJoao = new ContaBancaria();
        joao.conta = contaJoao;
        
        ContaBancaria contaAna = new ContaBancaria();
        ana.conta = contaAna;
        
        //Definindo dados da conta
        contaJoao.setAgencia("1000-0");
        contaJoao.setNumero("2000-0");
        System.out.println("agencia joao: " + contaJoao.getAgencia());
        System.out.println("numero joao: " + contaJoao.getNumero());
       
        System.out.println("Saldo joao anterior: " + joao.conta.getSaldo());
        contaJoao.transferir(100, contaAna);
        System.out.println("Saldo ana anterior: " + ana.conta.getSaldo());
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
