package com.spring5.scope;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public abstract class TestService1 {

    @Lookup("prototypeService")
    public abstract PrototypeService getPrototypeService();

    public void test() {
        log.info("TestService1 test hashcode : {}", hashCode());
        PrototypeService service = getPrototypeService();
        service.test();
    }

}
