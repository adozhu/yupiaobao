package com.iNext.dao;

import java.util.List;

import com.iNext.entity.SysRoleEntity;
import org.springframework.stereotype.Repository;

/**
 * 角色管理
 * 
 */
@Repository
public interface SysRoleDao extends BaseDao<SysRoleEntity> {
	
	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}
