package com.spring5.prop;

import com.spring5.prop.p1.ExtPropertyPlaceholderConfigurer;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import com.spring5.prop.p1.Propels;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:propt2.xml")
@Slf4j
public class TestCase3 {

    @Autowired
    Propels propels;

    @Test
    public void test() {
        log.info(propels.toString());
    }

    @Value("${db.user}")
    private String user;
    public String getUser() {
        return user;
    }

    @Test
    public void test1() {
        log.info(user);
    }

    @Test
    public void test2() {
       log.info(ExtPropertyPlaceholderConfigurer.getCtxProp("db.pwd"));
    }
}
