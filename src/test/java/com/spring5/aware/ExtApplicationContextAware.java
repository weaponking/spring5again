package com.spring5.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ExtApplicationContextAware implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ExtApplicationContextAware.applicationContext = applicationContext;
    }

    public static <T> T getBean(Class<T> cls) {
        return (T) ExtApplicationContextAware.applicationContext.getBean(cls);
    }

    public static ApplicationContext getApplicationContext() {
        return ExtApplicationContextAware.applicationContext;
    }

}
