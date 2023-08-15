package com.Sesi.simulador_de_dados.Service;

import com.Sesi.simulador_de_dados.Model.M_Jogada;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class S_Dados {
    public static M_Jogada jogarDados(int qtdDados, int qtdFaces){
        int soma = 0;
        int maximo = 0;
        int resultado = 0;
        int[] jogadas = new int[qtdDados];
        for(int i = 1; i <= qtdDados; i++){
            Random rand = new Random();
            resultado = rand.nextInt(qtdFaces) + 1;
            jogadas[i-1] = resultado;
            soma += resultado;
            if(resultado > maximo){
                maximo = resultado;
            }
        }
        M_Jogada m_jogada = new M_Jogada(soma, jogadas, maximo);
        return m_jogada;
    }
}
