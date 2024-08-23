package com.loginSystem.loginSystem.DTO;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Setter
@Getter
@Component
public class JoinDTO {

    private String username;
    private String password;


}
