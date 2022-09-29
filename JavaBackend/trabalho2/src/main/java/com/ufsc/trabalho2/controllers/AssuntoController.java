package com.ufsc.trabalho2.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Map<String, String>> getById(@PathVariable("id") Long id) {
        Map<String, String> responseBody = new HashMap<>();
        try {
            AssuntoEntity assuntoFound = assuntoService.findById(id);
            responseBody = assuntoFound.getDto();
            return ResponseEntity
                    .status(HttpStatus.FOUND)
                    .body(responseBody);
        } catch (NoSuchElementException e) {
            responseBody.put("message", "Assunto not found.");
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(responseBody);
        } catch (Exception e) {
            responseBody.put("message", "Something went wrong.");
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(responseBody);
        }
    }

    @PostMapping("/add")
    public void add(@RequestBody AssuntoEntity assunto) {
        assuntoService.addAssunto(assunto);
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
