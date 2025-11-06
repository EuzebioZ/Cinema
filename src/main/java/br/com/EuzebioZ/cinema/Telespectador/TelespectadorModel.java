package br.com.EuzebioZ.cinema.Telespectador;

import br.com.EuzebioZ.cinema.Sessao.SessaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "tb_telespectador")
@AllArgsConstructor
@Data
public class TelespectadorModel{
    private String nome;
    @Column(unique=true)
    private String cpf;

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long codigo;

    @ManyToOne
    @JoinColumn(name="sessao_id")
        private SessaoModel sessao;

    @Override
    public String toString(){
        return "Codiogo: "+this.codigo+
        "Nome: "+this.nome+
        "CPF: "+ this.cpf;
    }
}