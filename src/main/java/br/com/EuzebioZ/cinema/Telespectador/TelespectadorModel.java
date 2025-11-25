package br.com.EuzebioZ.cinema.Telespectador;

import br.com.EuzebioZ.cinema.Sessao.SessaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tb_telespectador")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TelespectadorModel{
    private String nome;
    @Id
    @Column(unique=true)
    private String cpf;

    @ManyToOne
    @JoinColumn(name="sessao_id")
    private SessaoModel sessao;


}