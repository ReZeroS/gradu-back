package com.rezero.gradu.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/redis.properties")
public class RedisConfig {



}
