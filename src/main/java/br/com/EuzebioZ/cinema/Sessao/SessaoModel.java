package br.com.EuzebioZ.cinema.Sessao;

import br.com.EuzebioZ.cinema.Telespectador.TelespectadorModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "tb_sessao")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SessaoModel{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(unique=true)
    private Long codigo;

    @OneToMany(mappedBy = "sessao")
    @JsonIgnore
    private List<TelespectadorModel> telespectadores;

    @Override
    public String toString(){
         String resposta = "[";
         for(TelespectadorModel telespectador: this.telespectadores){
             resposta += (telespectador.toString()+",");
         }
         return resposta+"]";
    }
}