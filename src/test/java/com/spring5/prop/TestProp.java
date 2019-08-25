package com.spring5.prop;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("prop/prop.properties")
public class TestProp {

    @Value("${test1.name}")
    private String name;
    @Value("${test1.max}")
    private int max;
}
