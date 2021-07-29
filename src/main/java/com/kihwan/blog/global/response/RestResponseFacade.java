package com.kihwan.blog.global.response;

import com.kihwan.blog.global.response.RestResponse.Status;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RestResponseFacade {

    public static <T> RestResponse<T> init(Status status, T content) {
        RestResponse<T> response = new RestResponse<>();
        response.setStatus(status);
        response.setContent(content);
        return response;
    }




}