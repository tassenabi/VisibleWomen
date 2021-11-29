package com.visiblewomen.visiblewomen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class VisibleWomenApplication {

    public static void main(String[] args) {
        SpringApplication.run(VisibleWomenApplication.class, args);
    }

}
