package com.dominio;

public class Celula<T> {

    private T valor;
    private Celula<T> Proximo;

    public Celula(T valor) {
        this.valor = valor;
        this.Proximo = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Celula<T> getProximo() {
        return Proximo;
    }

    public void setProximo(Celula<T> proximo) {
        Proximo = proximo;
    }

}
