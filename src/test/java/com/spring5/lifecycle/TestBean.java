package com.spring5.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
@Slf4j
public class TestBean {

    @PostConstruct
    private void init() {
        log.info("TestBean init 2");
    }

    public void test() {
        log.info("test");
    }
}
