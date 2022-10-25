package com.liushengpei.dao;

import com.liushengpei.pojo.UserLogin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserLoginDao {

    /*
     * 用户登录查询
     * */
    UserLogin userlogin(String account, String password);

    /*
     * 添加用户登录信息
     * */
    Integer addUser(UserLogin userLogin);

    /**
     * 查询成员条数
     */
    Integer selectMember(String account);

    /**
     * 根据邮箱查询用户
     */
    UserLogin selectEmailUser(String email);

}
