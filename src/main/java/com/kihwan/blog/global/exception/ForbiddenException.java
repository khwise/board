package com.kihwan.blog.global.exception;

import org.springframework.http.HttpStatus;

public class ForbiddenException extends BusinessException {

    public ForbiddenException() {
        super(HttpStatus.FORBIDDEN);
    }
}
