package com.example.SpringBootDemo.domain;

import java.io.Serializable;

public class Area implements Serializable {
	private static final long serialVersionUID = 1L;
    private Long id;
    private Long level;
    private String name;
	private Long parentsId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public Long getParentsId() {
		return parentsId;
    }

	public void setParentsId(Long parentsId) {
		this.parentsId = parentsId;
    }
}