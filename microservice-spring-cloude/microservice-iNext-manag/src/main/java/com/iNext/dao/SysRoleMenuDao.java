package com.iNext.dao;

import java.util.List;
import com.iNext.entity.SysRoleMenuEntity;
import org.springframework.stereotype.Repository;

/**
 * 角色与菜单对应关系
 * 
 */
@Repository
public interface SysRoleMenuDao extends BaseDao<SysRoleMenuEntity> {
	
	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);
}
