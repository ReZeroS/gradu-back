package com.rezero.gradu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
@MapperScan("com.rezero.gradu.mapper.*")
public class GraduApplication {

    public static void main(String[] args) {

        SpringApplication.run(GraduApplication.class, args);

    }
}
