package first.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
interface SearchableEntities {

    @GetMapping("/all")
    public Object getAll();

    @GetMapping("/{id}")
    public Object getById(@PathVariable String id);

}
