package com.pavan.todoapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.todoapp.form.LoginForm;
import com.pavan.todoapp.service.AuthenticationService;

@RestController
public class AppLoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AuthenticationService authService;

    @PostMapping("login")
    public String loginUser(@RequestBody LoginForm form) {
        logger.info("user name: {}, password: {}", form.getUserName(), form.getPassword());


        return authService.isValidUser(form.getUserName(), form.getPassword()) ? "logged in" : "login failed";
    }

}
