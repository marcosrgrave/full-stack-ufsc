package first.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import first.demo.entities.GenericEntity;

public interface EntityRepository extends CrudRepository<GenericEntity, String> {

}
