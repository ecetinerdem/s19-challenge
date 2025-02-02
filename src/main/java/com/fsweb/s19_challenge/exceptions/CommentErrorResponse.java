package com.fsweb.s19_challenge.exceptions;

import java.time.LocalDateTime;

public record CommentErrorResponse(Integer status, String message, LocalDateTime localDateTime) {
}
