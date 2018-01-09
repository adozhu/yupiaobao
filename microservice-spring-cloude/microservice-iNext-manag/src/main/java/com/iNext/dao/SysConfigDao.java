package com.iNext.dao;

import org.apache.ibatis.annotations.Param;
import com.iNext.entity.SysConfigEntity;
import org.springframework.stereotype.Repository;

/**
 * 系统配置信息
 * 
 */
@Repository
public interface SysConfigDao extends BaseDao<SysConfigEntity> {
	
	/**
	 * 根据key，查询value
	 */
	String queryByKey(String paramKey);
	
	/**
	 * 根据key，更新value
	 */
	int updateValueByKey(@Param("key") String key, @Param("value") String value);
	
}
