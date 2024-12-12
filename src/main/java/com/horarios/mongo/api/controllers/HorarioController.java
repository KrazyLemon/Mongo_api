package com.horarios.mongo.api.controllers;

import com.horarios.mongo.api.models.Horario;
import com.horarios.mongo.api.services.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2/horarios")
public class HorarioController {

    @Autowired
    private HorarioService horarioService;

    @GetMapping
    public List<Horario> fetchAllHorarios() {
        return horarioService.getAllHorarios();
    }

    @GetMapping("/{grupo}")
    public Horario fetchHorarioByGrupo(@PathVariable("grupo") String grupo) {
        return horarioService.getHorarioByGrupo(grupo);
    }

    @PostMapping
    public void saveHorario(@RequestBody Horario horario) {
        horarioService.saveHorario(horario);
    }

    @PutMapping
    public void updateHorario(@RequestBody Horario horario) {
        Horario horario1 = horarioService.getHorarioByGrupo(horario.getGrupo());
        horario1.setHorario(horario.getHorario());
        if(horario1.getId() != null) {
            horarioService.saveHorario(horario1);
        }else {
            System.out.println("No se encontro el horario");
        }
    }

}
