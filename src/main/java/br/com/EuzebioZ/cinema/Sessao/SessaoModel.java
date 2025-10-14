package br.com.EuzebioZ.cinema.Sessao;

import br.com.EuzebioZ.cinema.Telespectador.TelespectadorModel;
import jakarta.persistence.*;

import java.util.ArrayList;

@Table(name = "tb_sessao")
@Entity
public class SessaoModel{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long codigo;
    private ArrayList<TelespectadorModel> telespectadores = new ArrayList<TelespectadorModel>();

    public SessaoModel(ArrayList<TelespectadorModel> telespectadores) {
        this.telespectadores = telespectadores;
    }

    @Override
    public String toString(){
         String resposta = "[";
         for(TelespectadorModel telespectador: this.telespectadores){
             resposta += (telespectador.toString()+",");
         }
         return resposta+"]";
    }
}