package com.iNext.dao;

import java.util.List;

import com.iNext.entity.SysUserRoleEntity;
import org.springframework.stereotype.Repository;

/**
 * 用户与角色对应关系
 * 
 */
@Repository
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {
	
	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);
}