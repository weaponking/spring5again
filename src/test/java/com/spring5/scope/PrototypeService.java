package com.spring5.scope;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
@Scope("prototype")
@Slf4j
public class PrototypeService {

    @PostConstruct
    public void init() {
        log.info("PrototypeService PostConstruct hashcode : {}", hashCode());
    }

    public void test() {
        log.info("PrototypeService test hashcode : {}", hashCode());
    }
}
