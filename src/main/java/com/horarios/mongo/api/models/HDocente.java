package com.horarios.mongo.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "horarios_docentes")
public class HDocente {

    @Id
    private String id;

    @Indexed(unique = true)
    private String docente_id;

    private List<List<String>> horario;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(String docente_id) {
        this.docente_id = docente_id;
    }

    public List<List<String>> getHorario() {
        return horario;
    }

    public void setHorario(List<List<String>> horario) {
        this.horario = horario;
    }
}
