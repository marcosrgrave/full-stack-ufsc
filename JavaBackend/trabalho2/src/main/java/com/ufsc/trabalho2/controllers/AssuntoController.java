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

import com.ufsc.trabalho2.entities.AssuntoEntity;
import com.ufsc.trabalho2.services.AssuntoService;

@RestController
@RequestMapping("/assunto")
public class AssuntoController {

    @Autowired
    private AssuntoService assuntoService = new AssuntoService();

    @GetMapping("/get_all")
    public Iterable<AssuntoEntity> getAll() {
        return assuntoService.getAll();
    }

    @GetMapping("/{id}")
    public AssuntoEntity getById(@PathVariable("id") Long id) {
        AssuntoEntity assuntoFound = assuntoService.findById(id);
        return assuntoFound;
    }

    @PostMapping("/add")
    public void add(@RequestBody AssuntoEntity assunto) {
        assuntoService.addAssunto(assunto);
    }

    @PostMapping("/addPostagem")
    public void add(@RequestBody Map<String, Long> payload) {
        Long idAssunto = payload.get("idAssunto");
        Long idPostagem = payload.get("idPostagem");
        assuntoService.addPostagem(idAssunto, idPostagem);
    }

    @PutMapping("/update")
    public void update(@RequestBody AssuntoEntity assunto) {
        assuntoService.updateAssunto(assunto.getId(), assunto);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Map<String, Long> idPayload) {
        assuntoService.deleteAssunto(idPayload.get("id"));
    }

}
