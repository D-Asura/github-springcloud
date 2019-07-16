package com.dragon.githubspringcloud.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dragon.githubspringcloud.base.RequestEntity;
import com.dragon.githubspringcloud.entity.Staff;
import com.dragon.githubspringcloud.service.IStaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wyl
 */

@Api(tags = {"员工信息"})
@RestController
@RequestMapping("/staff")
public class StaffController extends ApiController {

    @Autowired
    private IStaffService staffService;

    @ApiOperation("员工列表查询")
    @GetMapping("/list")
    public List<Staff> list() {
        return staffService.list();
    }

    @ApiOperation("员工分页查询")
    @PostMapping("/page")
    public IPage<Staff> page(@RequestBody RequestEntity<Staff> requestEntity) {

        Page<Staff> page = new Page<Staff>();
        QueryWrapper<Staff> queryWrapper = null;
        //判断分页参数是否为空
        if(requestEntity.getCurrent() != null&& requestEntity.getSize() != null){
            page.setCurrent(requestEntity.getCurrent());
            page.setSize(requestEntity.getSize());
        }
        //判断要查询的字段值是否为空
        if (requestEntity.getParams() != null) {
            queryWrapper = new QueryWrapper<>(requestEntity.getParams());
        }
        return staffService.page(page, queryWrapper);
    }


//    @ApiOperation("员工查询")
//    @GetMapping("/{queryString}")
//    public boolean save(@PathVariable String queryString) {
//        //TODO 学习jackson
//        Staff s = new Staff();
//        s.setPhoneNum("dasd");
//        ObjectMapper objectMapper = new ObjectMapper();
//        return false;
//    }

}