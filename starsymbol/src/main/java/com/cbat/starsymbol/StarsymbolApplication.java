package com.cbat.starsymbol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;


@SpringBootApplication(scanBasePackages = {
//        "com.cbat.monitor",
        "com.cbat.starsymbol"})
public class StarsymbolApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarsymbolApplication.class, args);
    }

}
