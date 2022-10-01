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

import com.ufsc.trabalho2.entities.EditorEntity;
import com.ufsc.trabalho2.services.EditorService;

@RestController
@RequestMapping("/editor")
public class EditorController {

    @Autowired
    private EditorService editorService = new EditorService();

    @GetMapping("/get_all")
    public Iterable<EditorEntity> getAll() {
        return editorService.getAll();
    }

    @GetMapping("/{id}")
    public EditorEntity getById(@PathVariable("id") Long id) {
        EditorEntity editorFound = editorService.findById(id);
        return editorFound;
    }

    @PostMapping("/add")
    public void add(@RequestBody EditorEntity editor) {
        editorService.addEditor(editor);
    }

    @PostMapping("/addPostagem")
    public void add(@RequestBody Map<String, Long> payload) {
        Long idEditor = payload.get("idEditor");
        Long idPostagem = payload.get("idPostagem");
        editorService.addPostagem(idEditor, idPostagem);
    }

    @PutMapping("/update")
    public void update(@RequestBody EditorEntity editor) {
        editorService.updateEditor(editor.getId(), editor);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Map<String, Long> idPayload) {
        editorService.deleteEditor(idPayload.get("id"));
    }

}
