package com.orive.security.interviewScheduler;


import lombok.Data;

@Data
public class UsersDto {

    private Long id;

    private String name;

    private String address;

    private String emailId;

    private String password;

    private String mobile;

    private Role role;

    private String profileUrl;

    private String forgetToken;

    private Integer otp;

}
