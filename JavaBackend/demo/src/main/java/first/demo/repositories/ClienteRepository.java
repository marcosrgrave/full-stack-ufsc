package first.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import first.demo.models.ClienteEntity;

public interface ClienteRepository extends CrudRepository<ClienteEntity, String> {

}
