package com.example.demo1.service;

import com.example.demo1.dto.UserDto;
import com.example.demo1.exceptoins.UserBirthdayValidationException;
import com.example.demo1.exceptoins.UserLoginValidationException;
import com.example.demo1.model.User;
import com.example.demo1.repositories.UserRepositories;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import static com.fasterxml.jackson.databind.type.LogicalType.DateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepositories userRepositories;

    private static int userId;

    @Override

    public UserDto create(UserDto userDto) {
        log.info("входим в метод create сервиса {}", userDto);
        incrementCount(userDto);
        if (!userBirthdayValidation(userDto)) {
            throw new UserBirthdayValidationException("дата должна быть меньше текущей");
        }
        if (userDto.getLogin().contains(" ")){
            throw new UserLoginValidationException("login содержит пробелы");
        }
        userNameValidation(userDto);
        User user = User.builder().id(userDto.getId()).name(userDto.getName()).login(userDto.getLogin())
                .email(userDto.getEmail()).birthday(userDto.getBirthday()).build();
        userRepositories.create(user);

        UserDto resultUserDto = UserDto.builder().id(user.getId()).name(user.getName()).login(user.getLogin())
                .email(user.getEmail()).birthday(user.getBirthday()).build();
        log.info("выходим из метода create сервиса {}", userDto);
        return resultUserDto;

    }
    public UserDto incrementCount(UserDto userDto){
        log.info("входим в метод каунтер {}", userDto);

        userId +=1;

        userDto.setId(userId);
        log.info("выходим из метода каунтер {}", userDto);
        return userDto;
    }
    public boolean userBirthdayValidation(UserDto userDto){
        LocalDate date = LocalDate.now();
        return userDto.getBirthday().isBefore(date);
    }
    public void userNameValidation(UserDto userDto){
        if (userDto.getName() == null || userDto.getName().length() == 0) {
            userDto.setName(userDto.getLogin());
        }
    }




}
