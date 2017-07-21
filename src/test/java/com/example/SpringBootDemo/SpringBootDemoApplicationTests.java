package com.example.SpringBootDemo;

import com.example.SpringBootDemo.dao.AreaMapper;
import com.example.SpringBootDemo.domain.Area;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {
    @Autowired
    private ObjectMapper objectMapper;

    public void out(Object obj) {
        try {
            System.out.println(objectMapper.writeValueAsString(obj));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
