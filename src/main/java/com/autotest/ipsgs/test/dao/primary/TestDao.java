package com.autotest.ipsgs.test.dao.primary;

import com.autotest.ipsgs.test.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDao {
    List<UserEntity> getListForUserEntity();
}
