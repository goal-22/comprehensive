package com.goal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.goal.mapper")
@SpringBootApplication
public class ComprehensiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComprehensiveApplication.class, args);
    }

}
