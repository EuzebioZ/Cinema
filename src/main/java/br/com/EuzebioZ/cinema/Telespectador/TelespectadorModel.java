package br.com.EuzebioZ.cinema.Telespectador;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_telespectador")
public class TelespectadorModel{
    private String nome;
    private String cpf;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    public TelespectadorModel() {}

    public TelespectadorModel(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "Codiogo: "+this.codigo+
        "Nome: "+this.nome+
        "CPF: "+ this.cpf;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}