package com.shenma.alicopy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.shenma.alicopy.entity.CollectProduct;

public interface CollectProductDao extends JpaRepository<CollectProduct, Long>, JpaSpecificationExecutor<CollectProduct>{

}
