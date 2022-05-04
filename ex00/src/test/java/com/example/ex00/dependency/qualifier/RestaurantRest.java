package com.example.ex00.dependency.qualifier;

import com.example.ex00.dependency.Chef;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class RestaurantRest {
    @Autowired
    @Qualifier("outback")
    private Restaurant outback;




    @Autowired
    @Qualifier("vips")
    private Restaurant vips;

    @Test
    public void RestaurantRest(){
        log.info("-----------------------------");
        log.info("outback: "+outback);
        log.info("outback: "+outback.sideBarCheck());
        log.info("vips: "+vips);
        log.info("vips: "+Restaurant.steak);
        log.info("-----------------------------");
    }

}
