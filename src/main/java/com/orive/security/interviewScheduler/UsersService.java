package com.orive.security.interviewScheduler;



import java.util.List;

public interface UsersService {

    UsersDto createUser(UsersDto userDto);

    UsersDto getUser(Long id);

    Users findUserByEmailId(String emailId);

    List<UsersDto> getUsers();
}
