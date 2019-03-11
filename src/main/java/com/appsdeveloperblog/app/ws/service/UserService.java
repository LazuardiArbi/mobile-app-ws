package com.appsdeveloperblog.app.ws.service;

import com.appsdeveloperblog.app.ws.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
//    method ini ada di UserServiceImpl (service.impl.)

    UserDto createUser(UserDto user);
    UserDto updateUser(String id, UserDto user);
    List<UserDto> getUsers(int page, int limit);
    void deleteUser(String id);

    UserDto getUser(String email);
    UserDto getUserByUserID(String userId);
}
