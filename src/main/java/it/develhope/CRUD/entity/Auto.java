package it.develhope.CRUD.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeModello;
    private String nomeTipo;

    public String getNomeModello() {
        return nomeModello;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNomeModello(String nomeModello) {
        this.nomeModello = nomeModello;
    }

    public void setNomeTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
