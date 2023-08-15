package com.Sesi.simulador_de_dados.Model;

public class M_Jogada {
    private int soma;
    private int[] dados;
    private int maximo;

    public M_Jogada(int soma, int[] dados, int maximo) {
        this.soma = soma;
        this.dados = dados;
        this.maximo = maximo;
    }

    public int[] getDados() {
        return dados;
    }

    public int getSoma() {
        return soma;
    }

    public int getMaximo() {
        return maximo;
    }
}
