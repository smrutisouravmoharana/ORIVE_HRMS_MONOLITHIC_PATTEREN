package com.orive.security.interviewScheduler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository userRepository;
    @Autowired
    private UsersMapper userMapper;

    @Override
    public UsersDto createUser(UsersDto userDto) {
        Users user = userMapper.toUser(userDto);
        Users userEntity = userRepository.save(user);
        userDto = userMapper.toUserDto(userEntity);
        return userDto;
    }

    @Override
    public UsersDto getUser(Long id) {
        Optional<Users> optionalUser = userRepository.findById(id);
        Users user = optionalUser.orElseThrow(() -> new ResourceNotFoundException("Resource not Found", HttpStatus.NOT_FOUND));
        UsersDto userDto = userMapper.toUserDto(user);
        return userDto;
    }

    @Override
    public Users findUserByEmailId(String emailId) {
        Users user = userRepository.findByEmailId(emailId).orElseThrow(() -> new ResourceNotFoundException("User not found ", HttpStatus.NOT_FOUND));
        return user;
    }

    @Override
    public List<UsersDto> getUsers() {
        List<Users> users = userRepository.findAll();
        List<UsersDto> userDtos = userMapper.toUserDtos(users);
        return userDtos;
    }
}
