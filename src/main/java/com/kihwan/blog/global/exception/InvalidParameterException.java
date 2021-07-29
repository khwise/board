package com.kihwan.blog.global.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.Map;

public class InvalidParameterException extends RuntimeException {
    private final static Logger log = LoggerFactory.getLogger(InvalidParameterException.class);
    private final HttpStatus httpStatus = HttpStatus.OK;
    private final Map<String,String> errors = new HashMap<>();

    public InvalidParameterException(BindingResult bindingResult) {
        bindingResult.getAllErrors().forEach(e -> {
            String fieldName = ((FieldError) e).getField();
            String errorMessage = e.getDefaultMessage();
            log.error("field name:{}, error message:{}", fieldName, errorMessage);
            errors.put(fieldName, errorMessage);
        });
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public Map<String,String> getErrors() {
        return errors;
    }
}
