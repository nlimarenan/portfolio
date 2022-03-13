package com.ms.kafka.application.ports;

import com.ms.kafka.adapters.inbound.dtos.UserResponseDto;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<UserResponseDto> getUser();
}
