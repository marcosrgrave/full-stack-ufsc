package com.ufsc.trabalho2.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

@Entity
public class PostagemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date data;
    private String titulo;
    private String text;

    @OneToMany(mappedBy = "postagem")
    private List<ComentarioEntity> comentarios = new ArrayList<>();

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "editor_id")
    private EditorEntity editor;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "postagem_assunto", joinColumns = @JoinColumn(name = "postagem_id"), inverseJoinColumns = @JoinColumn(name = "assunto_id"))
    private Set<AssuntoEntity> assuntos = new HashSet<>();

    public PostagemEntity() {
    }

    public PostagemEntity(String titulo) {
        this.titulo = titulo;
    }

    public Long getId() {
        return this.id;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<ComentarioEntity> getComentarios() {
        return this.comentarios;
    }

    public EditorEntity getEditor() {
        return this.editor;
    }

    public void setEditor(EditorEntity editor) {
        this.editor = editor;
    }

    public Set<AssuntoEntity> getAssuntos() {
        return this.assuntos;
    }

    public static Double getTotalPalavras() {
        throw new java.lang.UnsupportedOperationException("Not implemented yet.");
    }

}