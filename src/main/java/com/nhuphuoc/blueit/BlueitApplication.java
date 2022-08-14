package com.nhuphuoc.blueit;

import org.apache.logging.log4j.Logger;
import org.ocpsoft.prettytime.PrettyTime;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;


@SpringBootApplication

public class BlueitApplication {

//    private static final Logger log = (Logger) LoggerFactory.getLogger(BlueitApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(BlueitApplication.class, args);

    }
    @Bean
    PrettyTime prettyTime(){
        return new PrettyTime();
    }

}
