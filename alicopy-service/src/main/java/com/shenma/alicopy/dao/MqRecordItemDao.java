package com.shenma.alicopy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.shenma.alicopy.entity.MqRecordItem;

public interface MqRecordItemDao extends JpaRepository<MqRecordItem, Integer>, JpaSpecificationExecutor<MqRecordItem>{
	public MqRecordItem findByUrl(String url);
	
	public MqRecordItem findByRecordIdAndUrl(Integer recordId,String url);
	
	
	public List<MqRecordItem> findByUserIdAndDelStatus(String userId,Integer delStatus);
	
	@Modifying
	@Transactional
	@Query("delete from MqRecordItem where userId =? and delStatus=0")
	public void deleteWithUserId(String userId);
	

	public List<MqRecordItem> findByUserIdAndOldOfferIdAndStatus(String userId,String oldOfferId,Integer status);
	
}
