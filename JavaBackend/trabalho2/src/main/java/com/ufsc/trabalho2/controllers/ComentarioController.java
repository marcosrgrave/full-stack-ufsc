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

import com.ufsc.trabalho2.entities.ComentarioEntity;
import com.ufsc.trabalho2.services.ComentarioService;

@RestController
@RequestMapping("/comentario")
public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService = new ComentarioService();

    @GetMapping("/get_all")
    public Iterable<ComentarioEntity> getAll() {
        return comentarioService.getAll();
    }

    @GetMapping("/{id}")
    public ComentarioEntity getById(@PathVariable("id") Long id) {
        ComentarioEntity comentarioFound = comentarioService.findById(id);
        return comentarioFound;
    }

    @PostMapping("/add")
    public void add(@RequestBody ComentarioEntity comentario) {
        comentarioService.addComentario(comentario);
    }

    @PostMapping("/setPostagem")
    public void add(@RequestBody Map<String, Long> payload) {
        Long idComentario = payload.get("idComentario");
        Long idPostagem = payload.get("idPostagem");
        comentarioService.setPostagem(idComentario, idPostagem);
    }

    @PutMapping("/update")
    public void update(@RequestBody ComentarioEntity comentario) {
        comentarioService.updateComentario(comentario.getId(), comentario);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Map<String, Long> idPayload) {
        comentarioService.deleteComentario(idPayload.get("id"));
    }

}
