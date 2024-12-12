package com.horarios.mongo.api.repositories;

import com.horarios.mongo.api.models.HDocente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HDocenteRepository extends MongoRepository<HDocente, String> {

    @Query("{ 'docente_id': ?0 }")
    Optional<HDocente> findByDocente_id(String id);

}