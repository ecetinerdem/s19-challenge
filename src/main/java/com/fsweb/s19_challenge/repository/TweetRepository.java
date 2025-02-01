package com.fsweb.s19_challenge.repository;

import com.fsweb.s19_challenge.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

    @Query("SELECT t FROM Tweet t WHERE t.id = :tweetId")
    Optional<Tweet> findTweetById(@Param("tweetId") Long tweetId);

}