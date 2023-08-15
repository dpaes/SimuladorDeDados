package com.Sesi.simulador_de_dados.Model;

public class M_Dados {
    private Integer dados;
    private Integer soma;
    private Integer maximo;

    public M_Dados(Integer dados, Integer soma, Integer maximo) {
        this.dados = dados;
        this.soma = soma;
        this.maximo = maximo;
    }

    public Integer getDados() {
        return dados;
    }

    public Integer getSoma() {
        return soma;
    }

    public Integer getMaximo() {
        return maximo;
    }

    public void setDados(Integer dados) {
        this.dados = dados;
    }

    public void setSoma(Integer soma) {
        this.soma = soma;
    }

    public void setMaximo(Integer maximo) {
        this.maximo = maximo;
    }
}
