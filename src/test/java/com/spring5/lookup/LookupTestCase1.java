package com.spring5.lookup;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:lookup1.xml")
public class LookupTestCase1 {

    @Autowired
    CommandManager commandManager;

    @Test
    public void test() {
        log.info(commandManager.process("test command").toString());
    }

}
