package com.example.hanbit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerErrorRestController {
    @RequestMapping("/throwServerError")
    public void ThrowServerError() {
        throw new RuntimeException();
    }
}
