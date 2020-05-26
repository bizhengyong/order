package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

/**
 * @author bizy
 * @date 2020/5/3 12:05
 */
public interface OrderService {

    /*
     * @description: 注释
     * @param:
     * @author: bizy
     * @date: 2020/5/3 12:06
     */
    public OrderDTO create(OrderDTO orderDTO);
    
    /**
    *@description: 完结订单（只能卖家操作）
    *@param: 
    *@return:
    *@author: bizy
    *@date: 2020/5/26 20:23
    */
    OrderDTO finish(String orderId);
    
}
