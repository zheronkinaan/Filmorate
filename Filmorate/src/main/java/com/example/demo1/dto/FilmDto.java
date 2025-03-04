package com.example.demo1.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
public class FilmDto {
    private int id;
    private String name;
    private String description;
    private Date releaseDate;
    private double duration;
}
