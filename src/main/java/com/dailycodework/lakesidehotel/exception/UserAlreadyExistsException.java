package com.dailycodework.lakesidehotel.exception;

/**
 * @author Simpson Alfred
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
