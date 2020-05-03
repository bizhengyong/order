package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author bizy
 * @date 2020/5/3 11:17
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
}
