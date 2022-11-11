package com.ufsc.trabalho2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufsc.trabalho2.entities.ComentarioEntity;
import com.ufsc.trabalho2.entities.EditorEntity;
import com.ufsc.trabalho2.entities.PostagemEntity;
import com.ufsc.trabalho2.repositories.ComentarioRepository;
import com.ufsc.trabalho2.repositories.EditorRepository;
import com.ufsc.trabalho2.repositories.PostagemRepository;

@Service
public class PostagemService {

    @Autowired
    private PostagemRepository postagemRepository;

    @Autowired
    private ComentarioRepository comentarioRepository;

    @Autowired
    private AssuntoService assuntoService;

    @Autowired
    private EditorRepository editorRepository;

    public Iterable<PostagemEntity> getAll() {
        return postagemRepository.findAll();
    }

    public PostagemEntity findById(Long id) {
        return postagemRepository.findById(id).get();
    }

    public void addPostagem(PostagemEntity postagem) {
        postagemRepository.save(postagem);
    }

    public void updatePostagem(Long id, PostagemEntity postagem) {
        this.addPostagem(postagem);
    }

    public void deletePostagem(Long idPostagem) {
        postagemRepository.deleteById(idPostagem);
    }

    public void setEditor(Long idPostagem, Long idEditor) {
        PostagemEntity postagem = postagemRepository.findById(idPostagem).get();
        EditorEntity editor = editorRepository.findById(idEditor).get();

        postagem.setEditor(editor);
        postagemRepository.save(postagem);
    }

    public void addAssunto(Long idPostagem, Long idAssunto) {
        assuntoService.addPostagem(idAssunto, idPostagem);
    }

    public void addComentario(Long idPostagem, Long idComentario) {
        PostagemEntity postagem = postagemRepository.findById(idPostagem).get();
        ComentarioEntity comentario = comentarioRepository.findById(idComentario).get();

        comentario.setPostagem(postagem);
        comentarioRepository.save(comentario);
    }
}