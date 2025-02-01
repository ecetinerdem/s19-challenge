package com.fsweb.s19_challenge.repository;

import com.fsweb.s19_challenge.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

    // Query to find all tweets by a specific user
    @Query("SELECT t FROM Tweet t WHERE t.user.id = :userId")
    List<Tweet> findAllTweetsByUserId(@Param("userId") Long userId);


}