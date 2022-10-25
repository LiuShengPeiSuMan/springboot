package com.liushengpei.service.serviceimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liushengpei.dao.FamilyMemberDao;
import com.liushengpei.pojo.FamilyMember;
import com.liushengpei.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 家族成员管理
 */
@Service
public class MemberServiceImpl implements IMemberService {

    @Autowired
    private FamilyMemberDao memberDao;

    /**
     * 查询所有家族成员
     */
    @Override
    public List<FamilyMember> allMember() {
        //查询所有家族成员
        List<FamilyMember> familyMembers = memberDao.selectAll();
        return familyMembers;
    }

    /**
     * 分页查询
     */
    @Override
    public PageInfo<FamilyMember> pageMember(Integer num, Integer size) {
        PageHelper.startPage(num, size);
        List<FamilyMember> familyMembers = memberDao.selectAll();
        return new PageInfo<>(familyMembers);
    }
}
