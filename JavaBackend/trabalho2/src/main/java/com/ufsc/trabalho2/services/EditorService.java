package com.ufsc.trabalho2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufsc.trabalho2.entities.EditorEntity;
import com.ufsc.trabalho2.entities.PostagemEntity;
import com.ufsc.trabalho2.repositories.EditorRepository;
import com.ufsc.trabalho2.repositories.PostagemRepository;

@Service
public class EditorService {

    @Autowired
    private EditorRepository editorRepository;

    @Autowired
    private PostagemRepository postagemRepository;

    public Iterable<EditorEntity> getAll() {
        return editorRepository.findAll();
    }

    public EditorEntity findById(Long id) {
        return editorRepository.findById(id).get();
    }

    public void addEditor(EditorEntity editor) {
        editorRepository.save(editor);
    }

    public void updateEditor(Long id, EditorEntity editor) {
        EditorEntity editorFound = this.findById(id);
        this.addEditor(editor);
    }

    public void deleteEditor(Long idEditor) {
        editorRepository.deleteById(idEditor);
    }

    public EditorEntity addPostagem(Long idEditor, Long idPostagem) {
        EditorEntity editor = editorRepository.findById(idEditor).get();
        PostagemEntity postagem = postagemRepository.findById(idPostagem).get();

        postagem.setEditor(editor);
        postagemRepository.save(postagem);

        return editor;
    }

}