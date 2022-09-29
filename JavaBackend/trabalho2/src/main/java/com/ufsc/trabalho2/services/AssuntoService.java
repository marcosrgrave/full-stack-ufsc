package com.ufsc.trabalho2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufsc.trabalho2.entities.AssuntoEntity;
import com.ufsc.trabalho2.repositories.AssuntoRepository;

@Service
public class AssuntoService {

    @Autowired
    private AssuntoRepository assuntoRepository;

    public Iterable<AssuntoEntity> getAll() {
        return assuntoRepository.findAll();
    }

    public AssuntoEntity findById(Long id) {
        return assuntoRepository.findById(id).get();
    }

    public void addAssunto(AssuntoEntity assunto) {
        assuntoRepository.save(assunto);
    }

    public void updateAssunto(Long id, AssuntoEntity assunto) {
        AssuntoEntity assuntoFound = this.findById(id);
        this.addAssunto(assunto);
    }

    public void deleteAssunto(Long idAssunto) {
        assuntoRepository.deleteById(idAssunto);
    }

}