package com.liwei.repository;

import com.liwei.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

}
