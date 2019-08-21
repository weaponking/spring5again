package com.spring5.aware;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class ExtApplicationContextAwareTestCase {

    @Before
    public void init() {
       new ClassPathXmlApplicationContext("classpath:aware.xml");
    }

    @Test
    public void test() {
        AwareService service = ExtApplicationContextAware.getBean(AwareService.class);
        log.info(service.testAware("test aware"));
    }
}
