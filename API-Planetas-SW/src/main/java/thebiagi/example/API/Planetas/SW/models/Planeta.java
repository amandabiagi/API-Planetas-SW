package thebiagi.example.API.Planetas.SW.models;


import net.bytebuddy.asm.Advice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Planeta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;

    private String terreno;

    private String clima;

    private Integer qntAparicoesFilmes;

    public Planeta(Integer id, String nome, String terreno, String clima, Integer qntAparicoesFilmes) {
        this.id = id;
        this.nome = nome;
        this.terreno = terreno;
        this.clima = clima;
        this.qntAparicoesFilmes = qntAparicoesFilmes;
    }

    public Planeta() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public Integer getQntAparicoesFilmes() {
        return qntAparicoesFilmes;
    }

    public void setQntAparicoesFilmes(Integer qntAparicoesFilmes) {
        this.qntAparicoesFilmes = qntAparicoesFilmes;
    }
}
