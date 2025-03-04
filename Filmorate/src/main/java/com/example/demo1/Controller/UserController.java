package com.example.demo1.Controller;

import com.example.demo1.dto.UserDto;
import com.example.demo1.service.FilmService;
import com.example.demo1.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("/users")

    public UserDto createUser(@RequestBody UserDto userDto) {
        log.info("входим в метод криэйтюзер контроллера{}", userDto);
        userService.create(userDto);
        log.info("выходим из метода криэйтюзер контроллера{}", userDto);
        return userDto;
    }
}
