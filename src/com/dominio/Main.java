package com.dominio;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Fila<Integer> fila = new Fila<>();
        // Testando métodos
        // Antes de adicionar elementos na fila
        System.out.println("Tamanho: " + fila.getTamanho());
        System.out.println("A fila possui elementos? " + fila.contem());
        System.out.println("Cabeça da fila: " + fila.getCabecaFila());
        System.out.println("Fila\n" + fila.mostrarFila());

        // Adicionando elementos na fila
        fila.adicionar(1);
        fila.adicionar(2);
        fila.adicionar(3);
        fila.adicionar(4);
        fila.adicionar(5);
        fila.adicionar(6);
        System.out.println("\nApós adicionar elementos na fila:\n");

        // Após adicionar elementos na fila
        System.out.println("Tamanho: " + fila.getTamanho());
        System.out.println("A fila possui elementos? " + fila.contem());
        System.out.println("Cabeça da fila: " + fila.getCabecaFila());
        System.out.println("Fila\n" + fila.mostrarFila());

        // Mostrando elemento de uma determinada posição
        System.out.println("\nMostrando um dado elemento pela sua posição");
        System.out.println("Pegando um elemento da posição 0 da fila: " + fila.mostraElemento(0));
        System.out.println("Pegando um elemento da posição 1 da fila: " + fila.mostraElemento(1));
        System.out.println("Pegando um elemento da posição 2 da fila: " + fila.mostraElemento(2));
        System.out.println("Pegando um elemento da posição 3 da fila: " + fila.mostraElemento(3));
        System.out.println("Pegando um elemento da posição 6 da fila: " + fila.mostraElemento(6));

        // apagando o elemento do topo da fila
        System.out.println("\nRemovendo 2 elementos da fila");
        fila.removerFila();
        fila.removerFila();

        System.out.println("\nApós remover elementos:\n");
        System.out.println("Tamanho: " + fila.getTamanho());
        System.out.println("A fila possui elementos? " + fila.contem());
        System.out.println("Cabeça da fila: " + fila.getCabecaFila());
        System.out.println("Fila\n" + fila.mostrarFila());

        // Limpando toda a fila
        System.out.println("\nLimpando toda fila");
        fila.limparFila();

        System.out.println("\nApós limpar a fila:\n");
        System.out.println("Tamanho: " + fila.getTamanho());
        System.out.println("A fila possui elementos? " + fila.contem());
        System.out.println("Cabeça da fila: " + fila.getCabecaFila());
        System.out.println("Fila\n" + fila.mostrarFila());
        
    }
}
