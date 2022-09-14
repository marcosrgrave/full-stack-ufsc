package first.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import first.demo.utils.GenerateID;

@Entity
public abstract class GenericEntity {

    @Id
    private String id = GenerateID.uniqueID();

    public GenericEntity() {
    }

}
