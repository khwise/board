package com.kihwan.blog.global.exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends BusinessException {

    public BadRequestException() {
        super(HttpStatus.BAD_REQUEST);
    }
}
