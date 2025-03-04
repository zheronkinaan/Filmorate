package com.example.demo1.service;

import com.example.demo1.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public UserDto create(UserDto userDto);
}
