package com.fsweb.s19_challenge.service;

import com.fsweb.s19_challenge.entity.Tweet;
import com.fsweb.s19_challenge.exceptions.TweetException;
import com.fsweb.s19_challenge.repository.TweetRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TweetServiceImpl implements TweetService{

    private final TweetRepository tweetRepository;

    @Override
    public List<Tweet> findAllTweets() {
        return tweetRepository.findAll();
    }

    @Override
    public List<Tweet> findTweetByUserId(Long id) {
        return tweetRepository.findAllTweetsByUserId(id);
    }

    @Override
    public Tweet findTweetById(Long id) {
        Tweet foundTweet = tweetRepository.findById(id).orElseThrow(() -> new TweetException("Tweet with given id does not exist " + id, HttpStatus.NOT_FOUND));
        return null;
    }

    @Override
    public Tweet saveTweet(Tweet tweet) {
        return tweetRepository.save(tweet);
    }

    @Override
    public Tweet updateTweet(Long id, Tweet tweet) {
        Tweet foundTweet = findTweetById(id);
        if (foundTweet.getUser().equals(tweet.getUser())) {
            foundTweet.setContent(tweet.getContent());
            foundTweet.setIsLiked(tweet.getIsLiked());
            foundTweet.setIsRetweet(tweet.getIsRetweet());
            foundTweet.setComments(tweet.getComments());
            foundTweet.setLikes(tweet.getLikes());
            foundTweet.setRetweets(tweet.getRetweets());
            return foundTweet;
        } else
        return new TweetException("Tweet with given id does not exist " + id, HttpStatus.NOT_FOUND);
    }

    @Override
    public Void deleteTweet(Long id) {
        return null;
    }
}
