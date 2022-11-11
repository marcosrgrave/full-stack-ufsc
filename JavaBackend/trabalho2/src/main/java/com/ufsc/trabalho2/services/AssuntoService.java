package com.ufsc.trabalho2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufsc.trabalho2.entities.AssuntoEntity;
import com.ufsc.trabalho2.entities.PostagemEntity;
import com.ufsc.trabalho2.repositories.AssuntoRepository;
import com.ufsc.trabalho2.repositories.PostagemRepository;

@Service
public class AssuntoService {

    @Autowired
    private AssuntoRepository assuntoRepository;

    @Autowired
    private PostagemRepository postagemRepository;

    public Iterable<AssuntoEntity> getAll() {
        return assuntoRepository.findAll();
    }

    public AssuntoEntity findById(Long id) {
        return assuntoRepository.findById(id).get();
    }

    public void addAssunto(AssuntoEntity assunto) {
        assuntoRepository.save(assunto);
    }

    public void addPostagem(Long idAssunto, Long idPostagem) {
        PostagemEntity postagem = postagemRepository.findById(idPostagem).get();
        AssuntoEntity assunto = assuntoRepository.findById(idAssunto).get();
        postagem.getAssuntos().add(assunto);
        postagemRepository.save(postagem);
    }

    public void updateAssunto(Long id, AssuntoEntity assunto) {
        this.addAssunto(assunto);
    }

    public void deleteAssunto(Long idAssunto) {
        assuntoRepository.deleteById(idAssunto);
    }

}