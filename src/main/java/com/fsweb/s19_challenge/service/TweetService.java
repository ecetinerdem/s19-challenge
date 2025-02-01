package com.fsweb.s19_challenge.service;

import com.fsweb.s19_challenge.entity.Tweet;

import java.util.List;

public interface TweetService {
    List<Tweet> findAllTweets();
    List<Tweet> findTweetByUserId(Long id);
    Tweet findTweetById(Long id);
    Tweet saveTweet(Tweet tweet);
    Tweet updateTweet(Long id, Tweet tweet);
    void deleteTweet(Long id);

}
