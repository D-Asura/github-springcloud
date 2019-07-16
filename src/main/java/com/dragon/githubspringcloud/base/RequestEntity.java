package com.dragon.githubspringcloud.base;

import lombok.Data;

@Data
public class RequestEntity<T> {
    private Integer size = 10;
    private Integer current = 0;
    private T params;
}