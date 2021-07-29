package com.kihwan.blog.api.rest;

import com.kihwan.blog.global.response.RestResponse;
import com.kihwan.blog.global.response.RestResponseFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.kihwan.blog.global.response.RestResponse.Status.SUCCESS;

@RestController
public class HomeRestController {
    private final static Logger log = LoggerFactory.getLogger(HomeRestController.class);

    @GetMapping("/")
    public RestResponse<String> _home() {

        return RestResponseFacade.init(SUCCESS, "server running.");
    }
}