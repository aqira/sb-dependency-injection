package id.co.indocyber.dependencyinjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyInjectionApplication {
	public static void main(String[] args) {
		//IOC Container
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

		System.out.println("Terdapat bean: " + context.getBeanDefinitionNames().length);
		for (String beanDefinitionName : context.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}

		System.out.println(context.getBean("singleBean"));
		System.out.println(context.getBean("anotherSingleBean"));
		System.out.println(context.getBean("dependentBean"));

	}

	@Bean
	public BeanClass singleBean() {
		return new BeanClass();
	}

	@Bean
	public BeanClass anotherSingleBean(){
		return new BeanClass();
	}

	@Bean
	public String dependentBean(@Qualifier("singleBean") BeanClass bean) {
		return "saya bean yang menggunakan singleBean " + bean.toString();
	}

}