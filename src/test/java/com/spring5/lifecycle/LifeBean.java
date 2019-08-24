package com.spring5.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Slf4j
public class LifeBean implements InitializingBean, DisposableBean {

    @PostConstruct
    private void init() {
        log.info("LifeBean PostConstruct 2");
    }

    @PreDestroy
    private void end() {
        log.info("LifeBean PreDestroy 1");
    }

    public void destroy() throws Exception {
        log.info("LifeBean destroy 2");
    }

    public void afterPropertiesSet() throws Exception {
        log.info("LifeBean afterPropertiesSet 3");
    }
}
