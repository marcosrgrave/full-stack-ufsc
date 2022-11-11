package first.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import first.demo.entities.EnderecoEntity;

public interface EnderecoRepository extends CrudRepository<EnderecoEntity, String> {

}
