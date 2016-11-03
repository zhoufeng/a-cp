package com.shenma.alicopy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.shenma.alicopy.entity.AuthorizationEntity;

public interface AuthorizationEntityDao extends JpaRepository<AuthorizationEntity, Integer>, JpaSpecificationExecutor<AuthorizationEntity>{
	
	public AuthorizationEntity findByMemberId(String memberId);
}
