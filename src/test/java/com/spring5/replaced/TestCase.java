package com.spring5.replaced;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:replaced.xml")
public class TestCase {

    @Autowired
    SourceCls sourceCls;

    @Test
    public void test() {
        String target = sourceCls.sourceMehod();
        log.info("target : {}", target);
        Assert.assertEquals(target, "test");
    }
}
