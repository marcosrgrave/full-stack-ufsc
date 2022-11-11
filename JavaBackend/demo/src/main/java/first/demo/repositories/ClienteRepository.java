package first.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import first.demo.entities.ClienteEntity;

public interface ClienteRepository extends CrudRepository<ClienteEntity, String> {

}
