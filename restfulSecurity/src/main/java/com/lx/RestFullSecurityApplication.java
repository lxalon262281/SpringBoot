package com.lx;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.boot.SpringApplication.run;

/**
 * Created by yangyibo on 17/1/17.
 */

@ComponentScan(basePackages ="com.lx")
@SpringBootApplication
public class RestFullSecurityApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = run(RestFullSecurityApplication.class, args);
    }

}
