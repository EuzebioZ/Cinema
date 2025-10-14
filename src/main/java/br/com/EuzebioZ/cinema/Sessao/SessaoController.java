package br.com.EuzebioZ.cinema.Sessao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class SessaoController{
    @GetMapping("/Sessao")
    public String respostaSessao(){
        System.out.println("Sessão respondeu");
        return "Resposta da sessão";
    }
}