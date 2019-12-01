package com.ztkj.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.Serializable;

/**
 * 用户实体类
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer age;

    @JsonIgnore
    private Integer page;
    @JsonIgnore
    private Integer pageSize;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}