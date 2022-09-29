package com.ufsc.trabalho2.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class AssuntoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @ManyToMany(mappedBy = "assuntos")
    private List<PostagemEntity> postagens = new ArrayList<>();

    public AssuntoEntity() {
    }

    public AssuntoEntity(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return this.id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Map<String, String> getDto() {
        Map<String, String> dto = new HashMap<>();
        dto.put("id", getId().toString());
        dto.put("descricao", getDescricao());
        return dto;
    }

}
