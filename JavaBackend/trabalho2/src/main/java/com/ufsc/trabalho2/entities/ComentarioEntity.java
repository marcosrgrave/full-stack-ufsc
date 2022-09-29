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
    @JoinColumn(name = "comentario_id")
    private PostagemEntity postagem;

    public ComentarioEntity(String nome, Date data, String text) {
        this.nome = nome;
        this.data = data;
        this.text = text;
    }

    public void setPostagem(PostagemEntity postagem) {
        this.postagem = postagem;
    }

}