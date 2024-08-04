package com.example.hanbit.controller;

import com.example.hanbit.dto.Bookmark;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentTypeRestController {
    @RequestMapping(value = "/returnString", produces = "text/plain")
    public String returnString() {
        return "<strong>문자열</strong> 리턴";
    }

    @RequestMapping("/returnBookmark")
    public Bookmark returnBookmark() {
        return new Bookmark();
    }
}
