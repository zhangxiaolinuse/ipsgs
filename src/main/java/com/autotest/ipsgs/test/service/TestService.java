package com.autotest.ipsgs.test.service;

import com.autotest.ipsgs.test.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TestService {

    public List<UserEntity> getListForUserEntity();

    public List<UserEntity> getList2ForUserEntity();

}
