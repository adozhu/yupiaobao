package com.iNext.dao;

import java.util.Map;
import com.iNext.entity.ScheduleJobEntity;
import org.springframework.stereotype.Repository;

/**
 * 定时任务
 * 
 */
@Repository
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
