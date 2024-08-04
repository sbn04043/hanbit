package com.example.hanbit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
    @RequestMapping("/")
    public String hello() {
        return "Hello <strong>Backend</strong>";
    }

    @RequestMapping("/article")
    public String createArticle(@RequestParam String title, @RequestParam String content) {
        return String.format("title=%s / content=%s", title, content);
    }
}
