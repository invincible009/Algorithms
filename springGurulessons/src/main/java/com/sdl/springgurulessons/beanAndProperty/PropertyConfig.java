package com.sdl.springgurulessons.beanAndProperty;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${sdl.coronation.username}")
    String user;

    @Value("${sdl.coronation.password}")
    String password;

    @Value("${sdl.coronation.url}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }


    /*
    This property file configurer is gonna be be reading the configuration file.
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
