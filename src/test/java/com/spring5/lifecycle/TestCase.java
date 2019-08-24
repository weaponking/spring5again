package com.spring5.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {LifeCycleConfig.class})
@Slf4j
public class TestCase {

    @Autowired
    LifeBean bean;

    @Autowired
    TestBean testBean;

    @Test
    public void test() {
        testBean.test();
    }

}
