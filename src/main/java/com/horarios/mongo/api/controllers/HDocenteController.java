package com.horarios.mongo.api.controllers;

import com.horarios.mongo.api.DTOs.HDocenteDTO;
import com.horarios.mongo.api.models.HDocente;
import com.horarios.mongo.api.repositories.HDocenteRepository;
import com.horarios.mongo.api.services.HDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v2/hdocentes")
public class HDocenteController {

    @Autowired
    private HDocenteService hDocenteService;

    @GetMapping
    public List<HDocente> fetchAllHDocentes() {
        try {
            return hDocenteService.getAllHDocentes();
        } catch (Exception e) {
            System.out.println("Error al obtener los docentes");
            return null;
        }
    }

    @GetMapping("/{docente_id}")
    public HDocente fetchHDocenteByDocente_id(@PathVariable("docente_id") String docente_id) {
        try{
            return hDocenteService.getHDocenteByDocente_id(docente_id).orElse(null);
        } catch (Exception e) {
            System.out.println("Error al obtener el docente");
            return null;
        }
    }

    @PostMapping
    public void saveHDocente(@RequestBody HDocente hDocente) {
        hDocenteService.saveHDocente(hDocente);
    }

    @PutMapping
    public void updateHDocente(@RequestBody HDocente hDocente) {
        Optional<HDocente> hDocente1 = hDocenteService.getHDocenteByDocente_id(hDocente.getDocente_id());
        if (hDocente1.isPresent()) {
            hDocente.setHorario(hDocente1.get().getHorario());
            hDocenteService.saveHDocente(hDocente);
        } else {
            System.out.println("No se encontro el docente");
        }
    }
}
