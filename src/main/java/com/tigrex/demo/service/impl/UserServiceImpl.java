package com.tigrex.demo.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tigrex.demo.entity.bo.UserBO;
import com.tigrex.demo.entity.query.UserQuery;
import com.tigrex.demo.mapper.UserMapper;
import com.tigrex.demo.service.IUserService;

import com.tigrex.demo.utils.JacksonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author linus
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper mapper;

    @Override
    @Cacheable(value = "users", key = "#userQuery.id", cacheManager = "userRedisCacheManager")
    public UserBO getUser(UserQuery userQuery) {
        return JacksonUtils.getJackson().convertValue(mapper.selectById(userQuery.getId()), UserBO.class);
    }
}
