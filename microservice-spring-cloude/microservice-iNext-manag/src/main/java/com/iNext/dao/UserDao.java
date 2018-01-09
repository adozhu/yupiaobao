package com.iNext.dao;

import com.iNext.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * 用户
 * 
 */
@Repository
public interface UserDao extends BaseDao<UserEntity> {

    UserEntity queryByMobile(String mobile);
}
