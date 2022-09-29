package com.ufsc.trabalho2.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EditorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String senha;

    @OneToMany(mappedBy = "editor")
    private List<PostagemEntity> postagens = new ArrayList<>();

    public EditorEntity(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Double getTotalPostagens() {
        return 1.1;
    }

}