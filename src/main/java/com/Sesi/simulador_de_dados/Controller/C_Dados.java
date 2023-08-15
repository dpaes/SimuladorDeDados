package com.Sesi.simulador_de_dados.Controller;

import com.Sesi.simulador_de_dados.Model.M_Jogada;
import com.Sesi.simulador_de_dados.Service.S_Dados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Dados {

    @GetMapping("/")
    public String getIndex(){
        return "Index/index";
    }

    @PostMapping("/")
    public String postIndex(@RequestParam("faces") int faces,
                            @RequestParam("jogadas") int jogadas,
                            Model model){
        M_Jogada m_jogada = S_Dados.jogarDados(jogadas, faces);
        model.addAttribute("dados",m_jogada.getDados());
        model.addAttribute("soma",m_jogada.getSoma());
        model.addAttribute("maximo",m_jogada.getMaximo());
        return "Index/index";
    }
}
