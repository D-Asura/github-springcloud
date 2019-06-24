package com.dragon.githubspringcloud.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dragon.githubspringcloud.entity.Staff;
import com.dragon.githubspringcloud.mapper.StaffMapper;
import com.dragon.githubspringcloud.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

@Service
public class StaffService implements IStaffService {

    @Autowired
    private StaffMapper staffMapper;

    @Override
    public List<Staff> list() {
        QueryWrapper<Staff> qw = new QueryWrapper<>();
        return staffMapper.selectList(qw);
    }

    @Override
    public Staff getById(String id) {
        return null;
    }

    @Override
    public int insert(@Valid Staff entity) {
        return 0;
    }

    @Override
    public int updateById(@Valid Staff entity) {
        return 0;
    }

    @Override
    public void deleteById(Serializable id) {

    }
}
