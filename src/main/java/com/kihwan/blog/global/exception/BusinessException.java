package com.kihwan.blog.global.exception;

import org.springframework.http.HttpStatus;

public class BusinessException extends RuntimeException {

    protected final HttpStatus httpStatus;

    public BusinessException(HttpStatus httpStatus) {

        this.httpStatus = httpStatus;
    }
}
