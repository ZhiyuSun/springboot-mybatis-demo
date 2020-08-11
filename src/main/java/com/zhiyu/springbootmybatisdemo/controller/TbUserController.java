package com.zhiyu.springbootmybatisdemo.controller;

import com.zhiyu.springbootmybatisdemo.entity.TbUser;
import com.zhiyu.springbootmybatisdemo.service.TbUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbUser)表控制层
 *
 * @author makejava
 * @since 2020-08-10 15:42:40
 */
@RestController
@RequestMapping("tbUser")
public class TbUserController {
    /**
     * 服务对象
     */
    @Resource
    private TbUserService tbUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbUser selectOne(Integer id) {
        return this.tbUserService.queryById(id);
    }

}