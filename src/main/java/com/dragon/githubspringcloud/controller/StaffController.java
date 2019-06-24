package com.dragon.githubspringcloud.controller;


import com.dragon.githubspringcloud.entity.Staff;
import com.dragon.githubspringcloud.service.IStaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wyl
 */

@Api(tags = {"基础数据-公司信息"})
@RestController
@RequestMapping("/company")
public class StaffController {

    @Autowired
    private IStaffService staffService;

    @ApiOperation("公司查询")
    @GetMapping("")
    public List<Staff> list() {
        return staffService.list();
    }

//    @ApiOperation("公司查询")
//    @GetMapping("")
//    public List<Staff> list(@RequestParam String query) {
//        return staffService.list();
//    }

}