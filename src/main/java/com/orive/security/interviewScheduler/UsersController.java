package com.orive.security.interviewScheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

@RequestMapping("/users")
@RestController
@CrossOrigin(origins = "*")
public class UsersController {

    @Autowired
    private UsersService userService;

    @PostMapping("/createUser")
 // @PreAuthorize("hasRole('client_HR')")
    public HttpEntity<ResponseDto> createUser(@RequestBody UsersDto userDto) {
        userDto = userService.createUser(userDto);
        return new ResponseEntity<>(ResponseUtil.getSuccessResponse(userDto), HttpStatus.CREATED);
    }

    @GetMapping("/getUser/{id}")
 // @PreAuthorize("hasRole('client_HR')")
    public HttpEntity<ResponseDto> getUser(@PathVariable Long id) {
        UsersDto userDto = userService.getUser(id);
        return new ResponseEntity<>(ResponseUtil.getSuccessResponse(userDto), HttpStatus.OK);
    }

   
    
    @GetMapping("/getAll")
 // @PreAuthorize("hasRole('client_HR')")
    public ResponseEntity<List<UsersDto>> getAll() {
        List<UsersDto> userDtos = userService.getUsers();
        return new ResponseEntity<>(userDtos, HttpStatus.OK);
    }
}
