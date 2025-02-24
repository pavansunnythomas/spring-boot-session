package com.pavan.todoapp.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    
    private boolean isAutherized;

    public AuthenticationService() {
    } 
    
    public boolean isValidUser(String userName, String password) {

        isAutherized = "john".equals(userName) && "qwerty".equals(password);

        return isAutherized;
    }

}
