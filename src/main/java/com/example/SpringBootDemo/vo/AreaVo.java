package com.example.SpringBootDemo.vo;

import com.example.SpringBootDemo.domain.Area;

import java.util.Date;

public class AreaVo extends Area {
    private Date createDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
