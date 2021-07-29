package com.kihwan.blog.global.exception;

import org.springframework.http.HttpStatus;

public class UnauthorizedException extends BusinessException {

    public UnauthorizedException() {
        super(HttpStatus.UNAUTHORIZED);
    }
}