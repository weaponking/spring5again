package com.spring5.scope;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class TestCase2 {

    @Test
    public void test1() {
        int index = 0;
        do {
            ApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
            PrototypeService service = context.getBean(PrototypeService.class);
            log.info("ApplicationContext get PrototypeService hashcode : {} ", service.hashCode());
            index ++;
        } while (index<5);
    }
}
