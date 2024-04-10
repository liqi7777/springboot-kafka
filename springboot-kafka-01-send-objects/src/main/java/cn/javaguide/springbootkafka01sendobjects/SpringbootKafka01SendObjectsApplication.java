package cn.javaguide.springbootkafka01sendobjects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class SpringbootKafka01SendObjectsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootKafka01SendObjectsApplication.class, args);
    }

}
