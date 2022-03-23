package com.kdwz.erp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class LoginException extends ResponseStatusException {
    
    public LoginException(String msg) {
        super(HttpStatus.FORBIDDEN, msg);
    }
    
}
