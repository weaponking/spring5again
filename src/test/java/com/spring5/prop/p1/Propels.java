package com.spring5.prop.p1;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
@Slf4j
public class Propels {

    @Value("${test.name}")
    private String name;
    @Value("${test.max}")
    private int max;
    @Value("#{propels.name.concat(',').concat(propels.max)}")
    private String concat;
    @Value("#{T(java.util.UUID).randomUUID().toString()}")
    private String uid;
    @Value("#{T(com.spring5.prop.Utils).getPwd()}")
    private String pwd;
    @Value("${db.user}")
    private String user;

}
