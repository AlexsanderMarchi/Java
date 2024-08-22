
package com.mycompany.loja_eletrodomestico;


public class Loja_eletrodomestico {

    public static void main(String[] args) {
        Eletrodomestico television = new Eletrodomestico();
        television.marca = "Samsung";
        television.modelo = "Smart TV Crystal UHD 4K 50";
        television.preco = 2500;
        television.voltagem = 110;
        
        Eletrodomestico microondas = new Eletrodomestico();
        microondas.marca = "Electrolux";
        microondas.modelo = "Litros MEO20";
        microondas.preco = 600;
        microondas.voltagem = 220;
        
        Eletrodomestico geladeira = new Eletrodomestico();
        geladeira.marca = "Brastemp";
        geladeira.modelo = "Frost Free Duplex 375 Litros";
        geladeira.preco = 4000;
        geladeira.voltagem = 110;
        
        
        television.exibirInformacoes();
        System.out.println("-----------------------------------------------");
        microondas.exibirInformacoes();
        System.out.println("-----------------------------------------------");
        geladeira.exibirInformacoes();

        Cliente contaAna = new Cliente();
        contaAna.nome = "Ana Joaquina";
        contaAna.endereco = "Rua Teixeira ap.45";
        
        Cliente contaPedro = new Cliente();
        contaPedro.nome = "Pedro Luiz";
        contaPedro.endereco = "Rua Doutor Fulano, casa 16";
        
        System.out.println("-----------------------------------------------");
        contaPedro.comprarEletrodomestico(television);
    }
}
