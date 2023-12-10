package com.dominio;

public class Fila<T> {

    private Celula<T> inicio;
    private Celula<T> head;
    private int tamanho;

    public Fila() {
        this.inicio = null;
        this.head = null;
        this.tamanho = 0;
    }

    public void adicionar(T elemento) {
        Celula<T> celula = new Celula<T>(elemento);

        if (this.tamanho == 0) {
            this.head = celula;
        } else {
            celula.setProximo(this.inicio);
        }
        this.inicio = celula;
        this.tamanho++;
    }

    public void removerFila() {
        Celula<T> anterior = null;
        Celula<T> atual = this.inicio;

        if (this.tamanho == 1) {
            this.inicio = null;
            this.head = null;
        } else {
            for (int i = 0; i < this.tamanho; i++) {
                if (atual.getValor().equals(this.head.getValor())) {
                    this.head = anterior;
                    anterior.setProximo(null);
                }
                anterior = atual;
                atual = atual.getProximo();
            }
        }
        this.tamanho--;
    }

    public T getCabecaFila() {
        if (this.tamanho == 0) {
            return null;
        }
        return this.head.getValor();
    }

    public boolean contem() {
        if (this.tamanho == 0) {
            return false;
        }
        return true;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    // Retorna um elemento de uma determinada posição
    public T mostraElemento(int posicao) throws Exception {
        Celula<T> atual = this.inicio;

        if (this.tamanho == 0 || posicao > this.tamanho) {
            throw new Exception("Posição Inválida!!");
        }

        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual.getValor();
    }

    public void limparFila() {
        for (Celula<T> atual = this.inicio; atual != null;) {
            Celula<T> novoProximo = atual.getProximo();
            atual.setValor(null);
            atual.setProximo(null);
            atual = novoProximo;
        }
        this.inicio = null;
        this.head = null;
        this.tamanho = 0;
    }

    public T mostrarFila() {
        if (this.tamanho == 0) {
            return (T) ("[ ]");
        }
        StringBuilder sb = new StringBuilder();
        Celula<T> atual = this.inicio;

        sb.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append(atual.getValor()).append(", ");
            atual = atual.getProximo();
        }
        sb.append(atual.getValor()).append("]");

        return (T) sb.toString();
    }

}
