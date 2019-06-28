package com.dragon.githubspringcloud.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dragon.githubspringcloud.entity.Staff;
import com.dragon.githubspringcloud.mapper.StaffMapper;
import com.dragon.githubspringcloud.service.IStaffService;
import org.springframework.stereotype.Service;

@Service
public class StaffService extends ServiceImpl<StaffMapper, Staff> implements IStaffService {

}
