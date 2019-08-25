package com.spring5.prop;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestProp.class)
@Slf4j
public class TestCase1 {

    @Autowired
    TestProp testProp;

    @Autowired
    Environment environment;

    @Test
    public void test1() {
        log.info(testProp.toString());
        log.info(environment.getProperty("test.max").toString());
    }
}
