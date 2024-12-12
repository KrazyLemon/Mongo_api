package com.horarios.mongo.api.services;

import com.horarios.mongo.api.models.Horario;
import com.horarios.mongo.api.repositories.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorarioService {

    @Autowired
    private HorarioRepository horarioRepository;

    public List<Horario> getAllHorarios() {
       return horarioRepository.findAll();
    }

    public Horario getHorarioByGrupo(String grupo) {
        return horarioRepository.findByGrupo(grupo);
    }

    public void saveHorario(Horario horario) {
        horarioRepository.save(horario);
    }

}
