package com.example.SpringBootDemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@ActiveProfiles("dev")
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests  {
    @Autowired
    protected ObjectMapper objectMapper;

    @Autowired
    protected MockHttpServletRequest request;

    @Autowired
    private WebApplicationContext context;

    protected MockMvc mockMvc;

    @Before
    public void before(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testMockMvc() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/area/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
    }


    public void out(Object obj) {
        try {
            System.out.println(objectMapper.writeValueAsString(obj));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
