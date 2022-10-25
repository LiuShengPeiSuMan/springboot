package com.liushengpei.dao;

import com.liushengpei.pojo.FamilyMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FamilyMemberDao {

    /*
     * 查询所有家庭成员
     * */
    List<FamilyMember> selectAll();

    /**
     * 添加家族成员
     */
    Integer addMember(FamilyMember member);
}
