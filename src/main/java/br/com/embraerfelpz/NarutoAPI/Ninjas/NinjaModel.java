package br.com.embraerfelpz.NarutoAPI.Ninjas;

import br.com.embraerfelpz.NarutoAPI.Missoes.MissoesModel;
import jakarta.persistence.*;
import java.util.List;

// Class -> DB
@Entity
@Table(name = "tb_ninja")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // Um unico ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

    public NinjaModel() {}

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
