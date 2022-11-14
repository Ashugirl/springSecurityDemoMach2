package be.avivaCode.springSecurityDemoMach2.service;

import be.avivaCode.springSecurityDemoMach2.dto.UserDto;
import be.avivaCode.springSecurityDemoMach2.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
