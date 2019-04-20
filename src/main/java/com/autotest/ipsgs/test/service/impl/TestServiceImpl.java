package com.autotest.ipsgs.test.service.impl;

import com.autotest.ipsgs.test.dao.second.Test2Dao;
import com.autotest.ipsgs.test.dao.primary.TestDao;
import com.autotest.ipsgs.test.entity.UserEntity;
import com.autotest.ipsgs.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Autowired
    private Test2Dao test2Dao;

    @Override
    public List<UserEntity> getListForUserEntity(){
        return testDao.getListForUserEntity();
    }

    @Override
    public List<UserEntity> getList2ForUserEntity(){
        return test2Dao.getList2ForUserEntity();
    }
}
