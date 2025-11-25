package br.com.EuzebioZ.cinema.Telespectador;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/telespectador")
public class TelespectadorController{
    private TelespectadorService telespectadorService;

    public TelespectadorController(TelespectadorService telespectadorService){
        this.telespectadorService = telespectadorService;
    }

    // CREATE___________________________________
    @PostMapping("/create")
    public String criarTelepectador(){ return "Telespectador criado com Sucesso";}

    // READ____________________________________
    @GetMapping("/all")
    public List<TelespectadorModel> getTelespectadores(){return this.telespectadorService.getAll();}

    @GetMapping("/get/{cpf}")
    public TelespectadorModel getTelespectadorByCPF(@PathVariable String cpf){
        return telespectadorService.getByCPF(cpf);
    }

    // UPDATE___________________________________
    @PutMapping("/update")
    public String updateTelespectadorById(){ return "Update telectador por ID";}

    // DELETE____________________________________
    @DeleteMapping("/delete")
    public String deletTelespectadorById(){return "Delete telespectador por ID";}
}