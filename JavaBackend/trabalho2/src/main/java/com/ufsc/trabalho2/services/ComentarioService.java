package com.ufsc.trabalho2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufsc.trabalho2.entities.ComentarioEntity;
import com.ufsc.trabalho2.repositories.ComentarioRepository;

@Service
public class ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    public Iterable<ComentarioEntity> getAll() {
        return comentarioRepository.findAll();
    }

    public ComentarioEntity findById(Long id) {
        return comentarioRepository.findById(id).get();
    }

    public void addComentario(ComentarioEntity comentario) {
        comentarioRepository.save(comentario);
    }

    public void updateComentario(Long id, ComentarioEntity comentario) {
        ComentarioEntity comentarioFound = this.findById(id);
        this.addComentario(comentario);
    }

    public void deleteComentario(Long idComentario) {
        comentarioRepository.deleteById(idComentario);
    }

}