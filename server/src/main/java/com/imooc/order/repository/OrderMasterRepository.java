package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author bizy
 * @date 2020/5/3 11:16
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
}
