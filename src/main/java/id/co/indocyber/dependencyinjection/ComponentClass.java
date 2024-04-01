package id.co.indocyber.dependencyinjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComponentClass {
    //@Autowired
    private final BeanClass beanClass;

    public ComponentClass(@Qualifier("singleBean") BeanClass beanClass) {
        System.out.println("membuat objek component, dengan DI dari bean class singleBean :" + beanClass.toString());
        this.beanClass = beanClass;
    }

    public String describeSelf(){
        return "objek dari @Component, ketergantungan dengan singleBean :" + beanClass.toString();
    }
}
