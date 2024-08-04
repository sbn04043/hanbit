package com.example.hanbit.controller;

import com.example.hanbit.dto.Bookmark;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookmarkAjaxRestController {
    List<Bookmark> bookmarks = new ArrayList<Bookmark>();

    @PostMapping("/bookmark")
    public String registerBookmark(@RequestBody Bookmark bookmark) {
        bookmarks.add(bookmark);
        return "registered";
    }

    @GetMapping("/bookmarks")
    public List<Bookmark> getBookmarks() {
        return bookmarks;
    }
}
