package com.sdl.springgurulessons;

import com.sdl.springgurulessons.beanAndProperty.FakeDataSource;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringGurulessonsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(SpringGurulessonsApplication.class, args);
        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);

        System.out.println("The datasource password is "+fakeDataSource.getPassword());
    }

}
