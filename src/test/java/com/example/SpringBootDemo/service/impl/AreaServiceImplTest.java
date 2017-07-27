package com.example.SpringBootDemo.service.impl;

import com.example.SpringBootDemo.SpringBootDemoApplicationTests;
import com.example.SpringBootDemo.domain.Area;
import com.example.SpringBootDemo.service.AreaService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by zhongym on 2017/7/26.
 */
public class AreaServiceImplTest extends SpringBootDemoApplicationTests {
    @Autowired
    private AreaService areaService;

    @Test
    public void getArea() throws Exception {
        Area area = areaService.getArea(1L);
        out(area);
    }

    @Test
    public void save() throws Exception {
    }

}