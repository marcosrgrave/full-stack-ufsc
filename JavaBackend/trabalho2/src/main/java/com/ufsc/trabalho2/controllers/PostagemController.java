package com.ufsc.trabalho2.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufsc.trabalho2.entities.PostagemEntity;
import com.ufsc.trabalho2.services.PostagemService;

@RestController
@RequestMapping("/postagem")
public class PostagemController {

    @Autowired
    private PostagemService postagemService = new PostagemService();

    @GetMapping("/get_all")
    public Iterable<PostagemEntity> getAll() {
        return postagemService.getAll();
    }

    @GetMapping("/{id}")
    public PostagemEntity getById(@PathVariable("id") Long id) {
        PostagemEntity postagemFound = postagemService.findById(id);
        return postagemFound;
    }

    @PostMapping("/add")
    public void add(@RequestBody PostagemEntity postagem) {
        postagemService.addPostagem(postagem);
    }

    @PostMapping("/setEditor")
    public void setEditor(@RequestBody Map<String, Long> payload) {
        Long idPostagem = payload.get("idPostagem");
        Long idEditor = payload.get("idEditor");
        postagemService.setEditor(idPostagem, idEditor);
    }

    @PostMapping("/addAssunto")
    public void addAssunto(@RequestBody Map<String, Long> payload) {
        Long idPostagem = payload.get("idPostagem");
        Long idAssunto = payload.get("idAssunto");
        postagemService.addAssunto(idPostagem, idAssunto);
    }

    @PostMapping("/addComentario")
    public void addComentario(@RequestBody Map<String, Long> payload) {
        Long idPostagem = payload.get("idPostagem");
        Long idComentario = payload.get("idComentario");
        postagemService.addComentario(idPostagem, idComentario);
    }

    @PutMapping("/update")
    public void update(@RequestBody PostagemEntity postagem) {
        postagemService.updatePostagem(postagem.getId(), postagem);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Map<String, Long> idPayload) {
        postagemService.deletePostagem(idPayload.get("id"));
    }

}
