package br.com.EuzebioZ.cinema.Sessao;

import br.com.EuzebioZ.cinema.Telespectador.TelespectadorModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Table(name = "tb_sessao")
@Entity
@AllArgsConstructor
@Data
public class SessaoModel{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(unique=true)
    private long codigo;

    @OneToMany(mappedBy = "sessao")
    private ArrayList<TelespectadorModel> telespectadores;

    @Override
    public String toString(){
         String resposta = "[";
         for(TelespectadorModel telespectador: this.telespectadores){
             resposta += (telespectador.toString()+",");
         }
         return resposta+"]";
    }
}