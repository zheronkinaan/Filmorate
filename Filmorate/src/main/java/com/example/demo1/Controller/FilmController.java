package com.example.demo1.Controller;

import com.example.demo1.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FilmController {
    private final FilmService filmService;
}
