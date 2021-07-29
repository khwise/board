package com.kihwan.blog.global.exception;

import org.springframework.http.HttpStatus;

public class ConflictException extends BusinessException {

    public ConflictException() {
        super(HttpStatus.CONFLICT);
    }
}
