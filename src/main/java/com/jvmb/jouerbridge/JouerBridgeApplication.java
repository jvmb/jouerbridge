package com.jvmb.jouerbridge;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jvmb.jouerbridge.controller.jouerCtrl;

@SpringBootApplication
public class JouerBridgeApplication {

    private static final Logger logger = LoggerFactory.getLogger(jouerCtrl.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(JouerBridgeApplication.class, args);

        logger.info("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            logger.info(beanName);
        }
    }
}
