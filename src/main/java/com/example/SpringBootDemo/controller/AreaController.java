package com.example.SpringBootDemo.controller;

import com.example.SpringBootDemo.domain.Area;
import com.example.SpringBootDemo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhong on 2017/7/20.
 */
@RestController
@RequestMapping("/api/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @GetMapping("/{areaId}")
    public Area getArea(HttpServletRequest request, @PathVariable("areaId") Long areaId) {
        System.out.println("-- -->"+areaId);
        return areaService.getArea(2L);
    }

    @PostMapping("/sava")
    public Area save(@RequestBody Area area) throws Exception {
        areaService.save(area);
        return area;
    }

}
