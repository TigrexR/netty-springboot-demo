package com.tigrex.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tigrex.demo.entity.po.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * userMapper接口
 * @author linus
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}