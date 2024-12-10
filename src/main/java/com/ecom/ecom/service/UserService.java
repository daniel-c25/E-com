package com.ecom.ecom.service;

import com.ecom.ecom.entity.User;
import com.ecom.ecom.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser (){
        /*TODO
        deal with the implementation of the user creation feature
        * */
        return new User();
    }

}
