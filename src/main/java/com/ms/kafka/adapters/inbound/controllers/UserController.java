package com.ms.kafka.adapters.inbound.controllers;

import com.ms.kafka.adapters.inbound.dtos.UserResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public ResponseEntity<UserResponseDto> getUser() {

        return ResponseEntity.ok().build();
    }

}

