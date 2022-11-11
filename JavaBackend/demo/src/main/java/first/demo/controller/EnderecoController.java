package first.demo.controller;

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

import first.demo.entities.EnderecoEntity;
import first.demo.repositories.EnderecoRepository;

@RestController
@RequestMapping("/endereco")
public class EnderecoController implements SearchableEntities {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    @GetMapping("/all")
    public Iterable<EnderecoEntity> getAll() {
        return enderecoRepository.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public EnderecoEntity getById(@PathVariable String id) {
        return enderecoRepository.findById(id).get();
    }

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody EnderecoEntity endereco) {
        enderecoRepository.save(endereco);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Endereco " + endereco.getId() + " added to database.");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody EnderecoEntity endereco) {

        try {
            enderecoRepository.findById(endereco.getId()).get();

        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Endereco of id %s not found".formatted(endereco.getId()));
        }

        enderecoRepository.save(endereco);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Endereco %s updated.".formatted(endereco.getId()));

    }

    @DeleteMapping("delete")
    public ResponseEntity<String> delete(@RequestBody EnderecoEntity endereco) {
        enderecoRepository.deleteById(endereco.getId());
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Endereco %s Deleted".formatted(endereco.getId()));
    }

}
