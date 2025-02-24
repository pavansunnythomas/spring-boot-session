package com.pavan.todoapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.todoapp.form.LoginForm;

@RestController
public class AppLoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @PostMapping("login")
    public String loginUser(@RequestBody LoginForm form) {
        logger.info("user name: {}, password: {}", form.getUserName(), form.getPassword());
        return "logged in";
    }

}
