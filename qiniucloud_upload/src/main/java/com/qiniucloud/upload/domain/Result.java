package com.qiniucloud.upload.domain;

import lombok.Data;

/**
 * @author lin
 */
@Data
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    private Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


    public static <T> Result<T> buildResult(Integer code, String message, T data) {
        return new Result(code, message, data);
    }

    public static Result buildResult(Integer code, String message) {
        return new Result(code, message);
    }

}

