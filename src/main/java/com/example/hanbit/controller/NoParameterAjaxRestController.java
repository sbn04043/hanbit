package com.example.hanbit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoParameterAjaxRestController {
    @RequestMapping("/get-with-no-parameter")
    public String getWithNoParameter() {
        System.out.println("NoParameterAjaxRestController.getWithNoParameter");
        return "파라미터가 없는 get 요청";
    }
}
