package com.telecommunications.utils;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private int code;
    private String message;
    private Object data;

    public Result success(String message, Object data){
        return new Result(200, message, data);
    }

    public Result error(String message, Object data){
        return new Result(401, message, data);
    }

    public Result wrong(String message, Object data){
        return new Result(400, message, data);
    }
}
