package com.example.ex02.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class CustomError implements ErrorController {
                                //404인지 500인지 구분하기위해 서블릿리퀘스트가 필요하다.
    @GetMapping("/error")
    public String handleError(HttpServletRequest request){
        Object status= request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);   //현재 에러의 상태 (리턴타입: 오브젝트)

        if(status != null){
           int statusCode= Integer.valueOf(status.toString());
        if(statusCode== HttpStatus.NOT_FOUND.value()){
            return"error/404";
        }


        }
        return "error/500";


    }


}