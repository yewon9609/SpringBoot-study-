package com.example.ex00.dependency.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component  //해당 객체를 spring에서 관리하도록 설정
@Qualifier("desktop") @Primary //default로 설정
public class Desktop implements Computer{
    @Override
    public int getScreenWidth() {
        return 1920;
    }
}
