package com.ufsc.trabalho2.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ufsc.trabalho2.entities.ComentarioEntity;

public interface ComentarioRepository extends CrudRepository<ComentarioEntity, Long> {

}
