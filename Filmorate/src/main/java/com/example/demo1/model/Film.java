package com.example.demo1.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Builder
public class Film {
    private int id;
    private String name;
    private String description;
    private Date releaseDate;
    private double duration;
}
