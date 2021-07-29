package com.kihwan.blog.api.rest;

import com.kihwan.blog.global.exception.BusinessException;
import com.kihwan.blog.global.exception.InvalidParameterException;
import com.kihwan.blog.global.response.RestResponse;
import com.kihwan.blog.global.response.RestResponseFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

import static com.kihwan.blog.global.response.RestResponse.Status.ERROR;


/**
 * --------------------------------
 * Business Exception
 * --------------------------------
 * ** 200 : 유효하지 않는 정보 전달 시 발생
 * ** 400 : 비지니스 로직 상 올바르지 않은 요청 시 발생
 * ** 401 : 인증 되지 않은 사용자의 요청 시 발생
 * ** 403 : 권한이 없는 사용자의 요청 시 발생
 * ** 404 : 리소스를 찾을 수 없을 경우 발생
 * ** 409 : 리소스 충돌 시 발생
 *
 * --------------------------------
 * Server Exception
 * --------------------------------
 * 500 : 서버문제
 */

@RestControllerAdvice
public class RestResponseErrorHandler {
    private final static Logger log = LoggerFactory.getLogger(RestResponseErrorHandler.class);

    public RestResponse<Map<String,String>> handleInvalidParameterException(InvalidParameterException exception) {
        log.error("[handle invalid parameter]");
        RestResponse<Map<String, String>> response = RestResponseFacade.init(ERROR, exception.getErrors());
        log.error("response : {}", response);
        return response;
    }

    public void handleBusinessException(BusinessException exception) {

    }

    public void handleInternalException(Exception exception) {

    }
}