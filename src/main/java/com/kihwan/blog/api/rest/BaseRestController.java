package com.kihwan.blog.api.rest;

import com.kihwan.blog.global.exception.InvalidParameterException;
import org.springframework.validation.BindingResult;

public interface BaseRestController {

    default void hasError(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new InvalidParameterException(bindingResult);
        }
    }
}
