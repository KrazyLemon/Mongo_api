package com.horarios.mongo.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.horarios.mongo.api.models.Horario;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepository extends MongoRepository<Horario, String> {
    Horario findByGrupo(String grupo);
}
