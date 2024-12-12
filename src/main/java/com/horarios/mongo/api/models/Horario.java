package com.horarios.mongo.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "horarios_grupos")
public class Horario {

    @Id
    private String id;

    @Indexed(unique = true)
    private String grupo;

    private List<List<String>> horario;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public List<List<String>> getHorario() {
        return horario;
    }

    public void setHorario(List<List<String>> horario) {
        this.horario = horario;
    }

}
