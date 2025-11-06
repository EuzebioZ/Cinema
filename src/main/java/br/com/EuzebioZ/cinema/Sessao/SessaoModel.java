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

    @OneToMany(mappedBy = "sessao")
    private ArrayList<TelespectadorModel> telespectadores;

    public SessaoModel() {
        this.telespectadores = new ArrayList<TelespectadorModel>();
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