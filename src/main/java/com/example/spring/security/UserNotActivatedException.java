package com.example.spring.security;

import org.springframework.security.core.AuthenticationException;

/**
 * Created by fares on 11/21/16.
 */
public class UserNotActivatedException extends AuthenticationException{
    private static final long serialVersionUID = 1L;

    public UserNotActivatedException(String message) {
        super(message);
    }

    public UserNotActivatedException(String message, Throwable t) {
        super(message, t);
    }
}
