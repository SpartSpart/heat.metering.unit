package com.spart.heat.metering.unit.service;

import com.spart.heat.metering.unit.controller.model.User;
import com.spart.heat.metering.unit.repository.model.UserData;
import com.spart.heat.metering.unit.service.model.UserDetailsImpl;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserRegisterService {
    private final PasswordEncoder passwordEncoder;
    private final UserDetailsServiceImpl userDetailsServiceImpl;

    public UserRegisterService(PasswordEncoder passwordEncoder, UserDetailsServiceImpl userDetailsServiceImpl) {
        this.passwordEncoder = passwordEncoder;
        this.userDetailsServiceImpl = userDetailsServiceImpl;
    }

    public String register(User user){
        UserDetailsImpl userDetails =new UserDetailsImpl(user.getLogin(),passwordEncoder.encode(user.getPassword()),user.getEmail());

        return userDetailsServiceImpl.add(userDetails);
    }
}
