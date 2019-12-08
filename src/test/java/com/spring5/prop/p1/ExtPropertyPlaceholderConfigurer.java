package com.spring5.prop.p1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Slf4j
public class ExtPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    private static Map<String,String> ctxPropMap;

    private List<String> keys;
    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props) throws BeansException {
        super.processProperties(beanFactoryToProcess, props);
        ctxPropMap = new HashMap<>();
        for (Object key : props.keySet()){
            if(keys.contains(key.toString())) {
                //解密
                log.info("需要解密的kye: {}", key.toString());
            }
            String keyStr = key.toString();
            String value = String.valueOf(props.get(keyStr));
            ctxPropMap.put(keyStr,value);
        }
    }

    public static String getCtxProp(String name) {
        return ctxPropMap.get(name);
    }

    public static Map<String, String> getCtxPropMap() {
        return ctxPropMap;
    }

}
