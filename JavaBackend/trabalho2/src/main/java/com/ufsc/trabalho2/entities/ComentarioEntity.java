package com.ufsc.trabalho2.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ComentarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Date data;
    private String text;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "postagem_id")
    private PostagemEntity postagem;

    public ComentarioEntity() {
    }

    public ComentarioEntity(String nome) {
        this.nome = nome;
    }

    public ComentarioEntity(String nome, Date data, String text) {
        this.nome = nome;
        this.data = data;
        this.text = text;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public PostagemEntity getPostagem() {
        return this.postagem;
    }

    public void setPostagem(PostagemEntity postagem) {
        this.postagem = postagem;
    }

}