
package com.mycompany.loja_eletrodomestico;

//Métodos: exibirInformacoes()
//(imprime todos os atributos do eletrodoméstico);;;;
public class Eletrodomestico {
    String marca;
    String modelo;
    double preco;
    int voltagem;
    
    public void exibirInformacoes(){
        System.out.println("Marca: " + this.marca);
       System.out.println("Modelo: " + this.modelo);
       System.out.println("Voltagem: " + this.voltagem + "V");
       System.out.println("Preço: R$" + this.preco );

    }
}
