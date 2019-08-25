package com.spring5.prop;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:propt-dev.xml")
@Slf4j
@ActiveProfiles("dev")
public class TestCase2 {

    @Autowired
    Propels propels;

    @Test
    public void test() {
        log.info(propels.toString());
    }

}
