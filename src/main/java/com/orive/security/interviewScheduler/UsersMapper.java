package com.orive.security.interviewScheduler;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper
public interface UsersMapper {

    @Mapping(target = "password", ignore = true)
    UsersDto toUserDto(Users user);

    Users toUser(UsersDto user);

    List<Users> toUsers(List<UsersDto> userDtos);

    List<UsersDto> toUserDtos(List<Users> users);

}
