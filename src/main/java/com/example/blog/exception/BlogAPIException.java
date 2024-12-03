package com.example.blog.exception;

import org.springframework.http.HttpStatus;

public class BlogAPIException extends RuntimeException {
    private HttpStatus status;
    private String message;

    public BlogAPIException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }
}

