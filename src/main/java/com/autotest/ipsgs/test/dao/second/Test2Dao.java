package com.autotest.ipsgs.test.dao.second;

import com.autotest.ipsgs.test.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Test2Dao {
    List<UserEntity> getList2ForUserEntity();
}
