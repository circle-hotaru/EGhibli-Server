package me.circlehotarux.eghibli.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Film {
    private String filmId;
    private String title;
    private String description;
    private String director;
    private String producer;
    private Integer releaseDate;
    private String poster;
}
