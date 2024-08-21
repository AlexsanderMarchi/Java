
package com.mycompany.sistema_bancario;

public class ContaBancaria {
    
    double saldo;
    String agencia;
    String numero;
    
    public void depositar(double deposito){
        saldo = saldo + deposito;
    };
    
    public boolean sacar(double saque){
        if(saque <= saldo){
               saldo = saldo - saque;
               return true;
        }else{
           return false;
        }
      
    };
}