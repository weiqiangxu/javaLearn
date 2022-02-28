package com.example.study.model;

import lombok.Data;

@Data
public class WebError {
    private Integer code;
    private String message;

    //直接public无需定义返回值为void
    public WebError(Integer c,String m){
        // 无需this.xxx
        code = c;
        message = m;
    }
}
