package com.horarios.mongo.api.services;

import com.horarios.mongo.api.models.HDocente;
import com.horarios.mongo.api.repositories.HDocenteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class HDocenteService {

    private HDocenteRepository hDocenteRepository;

    public List<HDocente> getAllHDocentes() {
        return hDocenteRepository.findAll();
    }

    public Optional<HDocente> getHDocenteByDocente_id(String docente_id) {
        return hDocenteRepository.findByDocente_id(docente_id);
    }

    public void saveHDocente(HDocente hDocente) {
        hDocenteRepository.save(hDocente);
    }
}