package com.zhiyu.springbootmybatisdemo.entity;

import java.io.Serializable;

/**
 * (TbUser)实体类
 *
 * @author makejava
 * @since 2020-08-10 15:42:34
 */
public class TbUser implements Serializable {
    private static final long serialVersionUID = -86855909358935409L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 登录名
    */
    private String name;
    /**
    * 密码
    */
    private String password;


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}