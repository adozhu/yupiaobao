package com.iNext.dao;

import com.iNext.entity.TokenEntity;
import org.springframework.stereotype.Repository;

/**
 * 用户Token
 * 
 */
@Repository
public interface TokenDao extends BaseDao<TokenEntity> {
    
    TokenEntity queryByUserId(Long userId);

    TokenEntity queryByToken(String token);
	
}
