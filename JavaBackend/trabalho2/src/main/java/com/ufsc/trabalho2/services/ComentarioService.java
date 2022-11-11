package com.ufsc.trabalho2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufsc.trabalho2.entities.ComentarioEntity;
import com.ufsc.trabalho2.entities.PostagemEntity;
import com.ufsc.trabalho2.repositories.ComentarioRepository;
import com.ufsc.trabalho2.repositories.PostagemRepository;

@Service
public class ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @Autowired
    private PostagemRepository postagemRepository;

    public Iterable<ComentarioEntity> getAll() {
        return comentarioRepository.findAll();
    }

    public ComentarioEntity findById(Long id) {
        return comentarioRepository.findById(id).get();
    }

    public void addComentario(ComentarioEntity comentario) {
        comentarioRepository.save(comentario);
    }

    public void setPostagem(Long idComentario, Long idPostagem) {
        ComentarioEntity comentario = comentarioRepository.findById(idComentario).get();
        PostagemEntity postagem = postagemRepository.findById(idPostagem).get();
        comentario.setPostagem(postagem);
        comentarioRepository.save(comentario);
    }

    public void updateComentario(Long id, ComentarioEntity comentario) {
        this.addComentario(comentario);
    }

    public void deleteComentario(Long idComentario) {
        comentarioRepository.deleteById(idComentario);
    }

}