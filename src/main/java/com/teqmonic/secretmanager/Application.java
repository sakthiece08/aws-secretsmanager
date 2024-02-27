package com.teqmonic.secretmanager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Below sample code shows loading secrets using 1) Key defined in AWS Secrets Manager 2) Using custom property
     *
     * @param key
     * @param key2
     * @return
     */
    @Bean
    ApplicationRunner applicationRunner(@Value("${my-secret-key-1}") String key, @Value("${custom.property.key}") String key2){
        return args -> {
            System.out.println("Key1 value: " + key + " Key2 value: " + key2);
        };
    }

}
