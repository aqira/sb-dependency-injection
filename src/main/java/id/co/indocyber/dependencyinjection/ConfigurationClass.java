package id.co.indocyber.dependencyinjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
    private final BeanClass beanClass;

    public ConfigurationClass(@Qualifier("anotherSingleBean") BeanClass beanClass) {
        this.beanClass = beanClass;
    }

    @Bean
    public ConfigurationClass method(){
        System.out.println("1 configuration, dapat memiliki banyak bean");
        System.out.println("1 configuration, dapat memiliki banyak dependency, " +
                "yang dimana dependency tersebut dapat digunakan oleh banyak bean");
        System.out.println(beanClass.toString());
        return this;
    }

    @Bean
    public String anotherMethod(){
        System.out.println(beanClass.toString());
        return "berhasil juga";
    }
}
