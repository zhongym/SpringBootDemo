package com.example.SpringBootDemo.service.impl;

import com.example.SpringBootDemo.dao.AreaMapper;
import com.example.SpringBootDemo.domain.Area;
import com.example.SpringBootDemo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zhong on 2017/7/21.
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaMapper areaMapper;

    @Override
    public Area getArea(Long aeraId) {
        return areaMapper.getById(aeraId);
    }

    @Override
    public void sava(Area area)throws Exception{
        save(area);
    }

    @Override
    @Transactional
    public void save(Area area) throws Exception {
        areaMapper.insertSelective(area);
        throw new RuntimeException("");
    }
}
