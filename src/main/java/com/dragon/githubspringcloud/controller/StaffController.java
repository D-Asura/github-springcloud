package com.dragon.githubspringcloud.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.dragon.githubspringcloud.entity.Staff;
import com.dragon.githubspringcloud.service.IStaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @ApiOperation("员工查询")
    @GetMapping("/all")
    public List<Staff> list() {

        return staffService.list();
    }

}