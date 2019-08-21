package com.spring5.lookup;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class LookupTestCase {

    private ApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("classpath:lookup.xml");
    }

    @Test
    public void test() {
        CommandManager commandManager = context.getBean(CommandManager.class);
        log.info(commandManager.process("test command").toString());
    }

}
