package com.dragon.githubspringcloud;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dragon.githubspringcloud.controller.StaffController;
import com.dragon.githubspringcloud.entity.Staff;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.rmi.runtime.Log;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.mysql.cj.conf.PropertyKey.logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GithubSpringcloudApplicationTests {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    ObjectMapper mapper = new ObjectMapper();

    private String query = "{\n" +
            "\t\"id\": \"1\",\n" +
            "\t\"name\": \"测试\",\n" +
            "\t\"gender\": \"男\",\n" +
            "\t\"phoneNum\": \"123467984\",\n" +
            "\t\"age\": \"2\"\n" +
            "}";

//    private T entity;

    @Test
    public void contextLoads() {
    }

    @Test
    public void jacksonTest(){
        try {
            Staff staff = mapper.readValue(query, Staff.class);
            logger.info(staff.toString());
        } catch (IOException e) {
            e.printStackTrace();
            logger.info("捕获异常：jacksonTest");
        }
    }

}
