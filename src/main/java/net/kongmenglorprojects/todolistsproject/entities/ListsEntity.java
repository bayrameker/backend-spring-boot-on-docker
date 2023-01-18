package net.kongmenglorprojects.todolistsproject.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class ListsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonProperty
    private Long date;
    @JsonProperty
    private String title;
    @JsonProperty
    private String description;

    public ListsEntity() {}

    public ListsEntity(Long date, String title, String description) {
        this.date = date;
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
