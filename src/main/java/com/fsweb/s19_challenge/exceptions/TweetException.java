package com.fsweb.s19_challenge.exceptions;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;


@Getter
@Setter
@AllArgsConstructor
public class TweetException extends RuntimeException {
    private HttpStatus httpStatus;
    public TweetException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
