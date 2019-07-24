package com.testFileUpload.controller;

import org.apache.shiro.ShiroException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ExceptionController {

   /* // 捕捉 CustomRealm 抛出的异常
    @ExceptionHandler(AccountException.class)
    public String handleShiroException(Exception ex) {
        return ex.getMessage();
    }*/

    // 捕捉shiro的异常
    @ExceptionHandler(ShiroException.class)
    public String handle401() {
        return "您无权限访问";
    }

}