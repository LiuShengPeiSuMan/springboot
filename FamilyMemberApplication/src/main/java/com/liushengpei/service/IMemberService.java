package com.liushengpei.service;

import com.github.pagehelper.PageInfo;
import com.liushengpei.pojo.FamilyMember;

import java.util.List;

/**
 * 全部成员管理
 */
public interface IMemberService {

    /**
     * 查询所有家庭成员
     * */
    List<FamilyMember> allMember();

    /**
     * 分页查询
     * */
    PageInfo<FamilyMember> pageMember(Integer num,Integer size);
}
