package com.fsweb.s19_challenge.exceptions;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<TweetErrorResponse> handleException(TweetException tweetException) {
        log.error("A tweet error has occurred ", tweetException);
        TweetErrorResponse tweetErrorResponse = new TweetErrorResponse(tweetException.getHttpStatus().value(), tweetException.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(tweetErrorResponse, tweetException.getHttpStatus());
    }
}
