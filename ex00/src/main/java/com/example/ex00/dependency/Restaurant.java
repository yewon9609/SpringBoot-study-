package com.example.ex00.dependency;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data      //equals 재정의, hashCode재정의, toString재정의, getter,setter다 붙음
//@AllArgsConstructor  //모든 생성자를 초기화
@RequiredArgsConstructor
public class Restaurant {
//    @NonNull
    private final Chef chef;

//    @Autowired
//    public Restaurant(Chef chef) {
//        this.chef = chef;
//    }
}
