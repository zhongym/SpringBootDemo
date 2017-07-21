package com.example.SpringBootDemo.controller;

import com.example.SpringBootDemo.SpringBootDemoApplicationTests;
import com.example.SpringBootDemo.domain.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by zhong on 2017/7/20.
 */
public class AreaControllerTest extends SpringBootDemoApplicationTests {

    @Autowired
    private AreaController areaController;
    @Test
    public void getArea() throws Exception {
        Area area = areaController.getArea(1L);
        out(area);
    }

}