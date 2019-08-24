package com.spring5.scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {LifeCycleConfig.class})
public class TestCase1 {

    @Autowired
    TestService1 service;

    @Test
    @Repeat(5)
    public void test() {
        service.test();
    }
}
