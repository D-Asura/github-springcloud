package com.dragon.githubspringcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dragon.githubspringcloud.mapper")
public class GithubSpringcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubSpringcloudApplication.class, args);
    }

}
