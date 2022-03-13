package com.ms.kafka.application.services;

import com.ms.kafka.adapters.inbound.dtos.UserResponseDto;
import com.ms.kafka.application.ports.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public ResponseEntity<UserResponseDto> getUser() {
        return null;
    }
}
