package com.Sesi.simulador_de_dados.Controller;

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
    public String postIndex(@RequestParam("faces") Integer faces,
                            @RequestParam("jogadas") Integer jogadas,
                            Model model){
        // instanciar o model com metodo jogar dados que recebe dois parametros jogadas e faces.
        // adiciona no model os dados, soma e maximo para a view usando o addAttribute do model.
        return "Index/index";
    }
}
