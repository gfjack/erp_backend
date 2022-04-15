package com.kdwz.erp.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "<h1>当前用户 : " + SecurityContextHolder.getContext().getAuthentication().getName() + "<h1>";
    }

}
