package com.kihwan.blog.global.response;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RestResponse<T> {

    public enum Status {
        SUCCESS, ERROR
    }

    private Status status; // success or error

    private String errReason; // error의 이유
    private String errCode;
    private String errMsg;

    private T content;
}
