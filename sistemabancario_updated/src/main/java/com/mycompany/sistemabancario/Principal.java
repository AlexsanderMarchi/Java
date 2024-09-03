package com.mycompany.sistemabancario;

public class Principal {
    
    public static void main(String [] args){
        
        //Definindo os clientes João e Ana
        Cliente joao = new Cliente();
        joao.nome = "Joao Cardosas Filho";
        joao.profissao = "Cientista de Dados";
        joao.setCpf("222555444-99");
        
        Cliente ana = new Cliente();
        ana.nome = "Ana Taylor";
        ana.profissao = "Professora de inglês";
        ana.setCpf("555689485-99");
        
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
        System.out.println(joao.getCpf());
        System.out.println(joao.endereco);
        System.out.println("**********************");
        System.out.println(ana.nome);
        System.out.println(ana.getCpf());
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
        System.out.println("numero joao: " + contaJoao.getNumero());
        System.out.println("agencia joao: " + contaJoao.getAgencia());
        
        contaAna.setAgencia("1780-4");
        contaAna.setNumero("4300-4");
        System.out.println("numero Ana: " + contaAna.getNumero());
        System.out.println("agencia Ana: " + contaAna.getAgencia());
        
        //Movimentações das Contas
        System.out.println("**********************");
        contaJoao.depositar(1000);
        System.out.println("Saldo joao antes : " + joao.conta.getSaldo());
        System.out.println("Saldo ana antes: " + ana.conta.getSaldo());
        
        System.out.println("**********************");

        contaJoao.transferir(150, contaAna);
        System.out.println("Saldo joao depois: " + joao.conta.getSaldo());
        System.out.println("Saldo ana depois: " + ana.conta.getSaldo());
    }
    
}
