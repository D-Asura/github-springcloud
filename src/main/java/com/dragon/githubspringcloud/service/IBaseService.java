package com.dragon.githubspringcloud.service;

import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

public interface IBaseService<T> {
    //    IPage<T> query(@Valid Query<T> filter);
//
//    List<T> list(@Valid Query<T> filter);
    List<T> list();

    T getById(String id);

    int insert(@Valid T entity);

    int updateById(@Valid T entity);

    void deleteById(Serializable id);
}
