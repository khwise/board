package com.kihwan.blog.global.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends BusinessException  {

    public NotFoundException() {
        super(HttpStatus.NOT_FOUND);
    }
}
