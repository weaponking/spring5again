package com.spring5.replaced;

import org.springframework.beans.factory.support.MethodReplacer;
import java.lang.reflect.Method;

public class TargetCls implements MethodReplacer {

    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        return "test";
    }

}
