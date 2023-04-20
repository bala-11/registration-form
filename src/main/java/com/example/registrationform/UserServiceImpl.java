package com.example.registrationform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo ur;

    @Override
    public void registerUser(User user) {
        ur.save(user);
    }
    
}
