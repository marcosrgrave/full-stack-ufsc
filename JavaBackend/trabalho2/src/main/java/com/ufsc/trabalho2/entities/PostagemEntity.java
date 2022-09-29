package com.ufsc.trabalho2.entities;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
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

    @ManyToMany
    @JoinTable(name = "postagem_assunto", joinColumns = @JoinColumn(name = "postagem_id"), inverseJoinColumns = @JoinColumn(name = "assunto_id"))
    private List<AssuntoEntity> assuntos = new ArrayList<>();

    @OneToMany(mappedBy = "postagem")
    private List<ComentarioEntity> comentarios = new ArrayList<>();

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "editor_id")
    private EditorEntity editor;

    public PostagemEntity() {
    }

    public PostagemEntity(String titulo) {
        this.titulo = titulo;
    }

    public static Double getTotalPalavras() {
        throw new java.lang.UnsupportedOperationException("Not implemented yet.");
    }

    public void setEditor(EditorEntity editor) {
        this.editor = editor;
    }

}