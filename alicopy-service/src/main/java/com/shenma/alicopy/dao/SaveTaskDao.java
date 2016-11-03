package com.shenma.alicopy.dao;

import com.shenma.alicopy.entity.SaveTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface SaveTaskDao extends JpaRepository<SaveTask, Integer>, JpaSpecificationExecutor<SaveTask>{

	
	public List<SaveTask> findByBatchType(Integer batchType);
	
}
