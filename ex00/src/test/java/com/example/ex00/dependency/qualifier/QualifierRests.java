package com.example.ex00.dependency.qualifier;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Primary;

@SpringBootTest
@Slf4j
public class QualifierRests {
    @Autowired
    @Qualifier("desktop")
    private Computer desktop;

    @Autowired
    @Qualifier("laptop")
    private Computer laptop;

    @Autowired
    private Computer computer;


    @Test
    public void qulifierTest(){
        log.info("-----------------------------");
        log.info("desktop: "+desktop.getScreenWidth());
        log.info("laptop: "+laptop.getScreenWidth());
        log.info("computer: "+computer.getScreenWidth());
        log.info("-----------------------------");
    }


}
