package br.com.EuzebioZ.cinema.Sessao;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/sessao")
@RestController
public class SessaoController{
    @GetMapping("/get")
    public String getSessaoById(){return "Retor na sessao por ID";}

    @GetMapping("/all")
    public String getSessoes(){return "Todas as sessoes";}

    @DeleteMapping("/delete")
    public String deleteSessaoById(){return "Deleta sessao por ID";}

    @PutMapping("/update")
    public String updateSessaoById(){return "Update sessao por id";}

    @PostMapping("/create")
    public String createSessao(){return "Cria sessao";}
}