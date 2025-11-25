package br.com.EuzebioZ.cinema.Telespectador;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelespectadorService{
    private TelespectadorRepository telespectadorRepository;

    public TelespectadorService(TelespectadorRepository telespectadorRepository){
        this.telespectadorRepository = telespectadorRepository;
    }

    public List<TelespectadorModel> getAll(){
        return this.telespectadorRepository.findAll();
    }

    public TelespectadorModel getByCPF(String cpf){
        Optional<TelespectadorModel> telespectador = this.telespectadorRepository.findById(cpf);
        return telespectador.orElse(null);
    }
}