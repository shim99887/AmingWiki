package com.thirautech.amingwiki;

import com.thirautech.amingwiki.security.SessionListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.http.HttpSessionListener;

@SpringBootApplication
public class AmingWikiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmingWikiApplication.class, args);
    }

    @Bean
    public HttpSessionListener httpSessionListener(){
        return new SessionListener();
    }

}
