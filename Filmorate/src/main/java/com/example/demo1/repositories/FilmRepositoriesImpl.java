package com.example.demo1.repositories;

import com.example.demo1.model.Film;
import com.example.demo1.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class FilmRepositoriesImpl implements FilmRepositories {
    private final ArrayList<Film> filmArrayList = new ArrayList<>();

    public Film create(Film film) {
        filmArrayList.add(film);
        return film;
    }
}
