package com.loginSystem.loginSystem.Service;

import com.loginSystem.loginSystem.DTO.CustomUserDetails;
import com.loginSystem.loginSystem.Entity.User;
import com.loginSystem.loginSystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User userData = userRepository.findByUsername(username);

        if (userData != null) {

            throw new UsernameNotFoundException("해당 사용자명을 가진 사용자를 찾을 수 없습니다: " + username);
            //UserDetails에 담아서 return하면 AutneticationManager가 검증 함

        }

        return new CustomUserDetails(userData);
    }
}