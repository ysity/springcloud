package com.crescentd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/native")
public class NativeConfigController {

    @Value("${server.port}")
    private int port;

    @Value("${foo}")
    private String version;

    @GetMapping("/index")
    public String index(){
        return this.port + "-" + this.version;
    }
}
