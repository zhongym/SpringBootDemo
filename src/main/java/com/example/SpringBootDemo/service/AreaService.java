package com.example.SpringBootDemo.service;

import com.example.SpringBootDemo.domain.Area;

/**
 * Created by zhong on 2017/7/20.
 */
public interface AreaService {

    Area getArea(Long aeraId);

    void save(Area area) throws Exception;

}
