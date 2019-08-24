package com.spring5.scope;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService {

    @Autowired
    private PrototypeService service;

    public void test() {
        log.info("TestService test hashcode : {}", hashCode());
        service.test();
    }
}
