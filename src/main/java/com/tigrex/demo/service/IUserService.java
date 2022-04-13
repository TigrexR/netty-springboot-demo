package com.tigrex.demo.service;

import com.tigrex.demo.entity.bo.UserBO;
import com.tigrex.demo.entity.query.UserQuery;

/**
 * @author linus
 */
public interface IUserService {

    /**
     * get user
     * @param userQuery
     * @return userBO
     */
    UserBO getUser(UserQuery userQuery);
}