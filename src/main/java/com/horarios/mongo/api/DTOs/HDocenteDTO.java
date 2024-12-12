package com.horarios.mongo.api.DTOs;


import java.util.List;

public class HDocenteDTO {

    private String docente_id;
    private String id;
    private List<List<String>> horarios;

    public HDocenteDTO() {
    }

    public String getDoncente_id() {
        return docente_id;
    }

    public void setDoncente_id(String doncente_id) {
        this.docente_id = doncente_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<List<String>> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<List<String>> horarios) {
        this.horarios = horarios;
    }
}
