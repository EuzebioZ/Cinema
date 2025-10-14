package br.com.EuzebioZ.cinema.Telespectador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TelespectadorController{
    @GetMapping("/telespectador")
    public String respostaTelespecatador(){
        System.out.println("Telespectador respondeu");
        return "resposta do telespectador";
    }

}