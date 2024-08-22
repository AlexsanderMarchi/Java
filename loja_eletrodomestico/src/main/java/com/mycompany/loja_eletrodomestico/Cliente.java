
package com.mycompany.loja_eletrodomestico;


public class Cliente {
    String nome;
    String endereco;
    
    public void comprarEletrodomestico(Eletrodomestico eletrodomesticoObjeto){
    System.out.println(this.nome+" comprou um eletrodomestico: " );
    System.out.println("Marca: " + eletrodomesticoObjeto.marca);
    System.out.println("Modelo: " + eletrodomesticoObjeto.modelo);
    System.out.println("Voltagem: " + eletrodomesticoObjeto.voltagem);
    System.out.println("Preço: " + eletrodomesticoObjeto.preco);

    };
}
