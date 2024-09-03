package com.mycompany.sistemabancario;

public class ContaBancaria {

    private double saldo;
    private String agencia;
    private String numero;

    public double getSaldo() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setAgencia(String novaAgencia) {
        if (novaAgencia.length() == 6 && novaAgencia.charAt(4) == '-') {
            agencia = novaAgencia;
        }
    }

    public void setNumero(String novoNumero) {
        if (novoNumero.length() == 6 && novoNumero.charAt(4) == '-') {
            numero = novoNumero;
        }
    }

    public void depositar(double deposito) {
        if(deposito > 0){
        saldo = saldo + deposito;
        }
    }

    public boolean sacar(double saque) {
        if (saldo >= saque) {
            saldo = saldo - saque;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, ContaBancaria destino) {
        boolean sacou = this.sacar(valor);
        if (sacou) {
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }

    }

}
