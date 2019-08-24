1. ApplicationContextAware 

    验证定时任务获取上下文
    
2. lookup-method

    cglib生成子类 动态注入类不可为final 

3. replaced-method

    实现org.springframework.beans.factory.support.MethodReplacer接口
    
    cglib重新生成子类 重写配置方法返回值
   
4. 单例Bean引用原型Bean 

    implements ApplicationContextAware 使用ApplicationContext获取prototype bean
    
    @Lookup 注入
    
    https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#beans-factory-method-injection
    
