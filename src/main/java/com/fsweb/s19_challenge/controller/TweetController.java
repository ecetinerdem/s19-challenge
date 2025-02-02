package com.fsweb.s19_challenge.controller;

import com.fsweb.s19_challenge.service.TweetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RequestMapping
@RestController("/tweet")
public class TweetController {

    private final TweetService tweetService;

    @GetMapping
    public List<TweetResponse>
}
