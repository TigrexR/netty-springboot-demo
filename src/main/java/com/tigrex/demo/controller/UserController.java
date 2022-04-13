package com.tigrex.demo.controller;

import com.tigrex.demo.entity.query.UserQuery;
import com.tigrex.demo.entity.vo.UserVO;
import com.tigrex.demo.service.IUserService;
import com.tigrex.demo.utils.JacksonUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linus
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String hello() {
        return "hello world!";
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public UserVO getUser(@RequestBody() UserQuery userQuery) {
        return JacksonUtils.getJackson().convertValue(userService.getUser(userQuery), UserVO.class);
    }
}
