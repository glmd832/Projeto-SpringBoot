package br.com.sisnema.milionarios.dto;

import br.com.sisnema.milionarios.entities.Pais;

import java.io.Serializable;

public class PaisDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    //private String pais;

    public PaisDTO() {
    }

    public PaisDTO(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public PaisDTO(Pais entidade) {
        this.id = entidade.getId();
        this.nome = entidade.getNome();
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
}
