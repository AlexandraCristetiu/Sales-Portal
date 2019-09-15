package com.example.demoSpring;

import com.example.demoSpring.beans.MyBean;
import com.example.demoSpring.beans.SecondName;
import com.example.demoSpring.config.AppConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoSpringApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(DemoSpringApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.register(AppConfig.class);
//		context.refresh();
//
//		MyBean bean = context.getBean(MyBean.class);
//		System.out.println(bean.sayHello());
//
//		bean.setName(new SecondName());
//		System.out.println(bean.sayHello());
//	}
}
