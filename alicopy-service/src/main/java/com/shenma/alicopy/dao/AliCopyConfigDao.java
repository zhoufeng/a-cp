package com.shenma.alicopy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.shenma.alicopy.entity.AliCopyConfig;

public interface AliCopyConfigDao extends JpaRepository<AliCopyConfig, Integer>, JpaSpecificationExecutor<AliCopyConfig>{
	
	public AliCopyConfig findByMemberId(String memberId);
}
