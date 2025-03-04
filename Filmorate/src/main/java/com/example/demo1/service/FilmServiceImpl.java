package com.example.demo1.service;

import com.example.demo1.repositories.FilmRepositories;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService {

    private final FilmRepositories filmRepositories;
}
