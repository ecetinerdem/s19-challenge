package com.fsweb.s19_challenge.controller;

import com.fsweb.s19_challenge.entity.Tweet;
import com.fsweb.s19_challenge.service.TweetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping
@RestController("/tweet")
public class TweetController {

    private final TweetService tweetService;

    @GetMapping
    public List<Tweet> findAllTweets() {
        return tweetService.findAllTweets();
    }

    @GetMapping("/{userId}")
    public List<Tweet> findTweetByUserId(@PathVariable("userId") Long id) {
        return tweetService.findTweetByUserId(id);
    }

    @GetMapping("/{tweetId}")
    public Tweet findTweetById(@PathVariable("tweetId") Long id) {
        return tweetService.findTweetById(id);
    }

    @PutMapping("/{tweetId}")
    public Tweet updateTweet(@PathVariable("tweetId") Long id, @RequestBody Tweet tweet) {
        return tweetService.updateTweet(id, tweet);
    }

    @DeleteMapping("/{tweetId}")
    public void deleteTweet(@PathVariable("tweetId") Long id) {
        tweetService.deleteTweet(id);
    }

}
