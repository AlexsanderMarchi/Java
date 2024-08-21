
package com.mycompany.sistema_bancario;

public class Principal {    

    public static void main(String[] args) {
       ContaBancaria contaAna = new ContaBancaria();
       contaAna.saldo = 1500.5;
       contaAna.numero = "123-3";
       contaAna.agencia = "000111222";
       
       System.out.println("Saldo da Ana = " + contaAna.saldo);
       System.out.println("Numero da agencia = " + contaAna.agencia);
       System.out.println("Numero da Conta = " + contaAna.numero);
       
       contaAna.depositar(150);
       System.out.println("Saldo da Ana após deposito = " + contaAna.saldo);
       
     System.out.println("-----------------------------------------------");

       
       ContaBancaria contaJoao = new ContaBancaria();
       contaJoao.saldo = 45078.5;
       contaJoao.numero = "189-8";
       contaJoao.agencia = "222111000";
       
       System.out.println("Saldo da Joao = " + contaJoao.saldo);
       System.out.println("Numero da agencia = " + contaJoao.agencia);
       System.out.println("Numero da Conta = " + contaJoao.numero);
       
       contaJoao.depositar(1.5);
       System.out.println("Saldo da Ana após deposito = " + contaJoao.saldo);
       
       boolean sacou = contaJoao.sacar(100000);
       if(sacou == true){
            System.out.println("Saldo da Joao após saque = " + contaJoao.saldo);
       }else{
            System.out.println("Não foi possivel realizar o saque");

       }
    }

}
