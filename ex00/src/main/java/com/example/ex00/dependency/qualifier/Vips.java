package com.example.ex00.dependency.qualifier;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@Qualifier("vips") @Primary
public class Vips implements Restaurant{

    @Override
    public boolean sideBarCheck() {
        return true;
    }
}
