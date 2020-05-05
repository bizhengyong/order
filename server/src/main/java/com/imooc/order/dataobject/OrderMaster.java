package com.imooc.order.dataobject;

import com.imooc.order.enums.OrderStatusEnum;
import com.imooc.order.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author bizy
 * @date 2020/5/3 11:18
 */
@Data
@Entity
public class OrderMaster {

    /** 订单ID */
    @Id
    private String orderId;

    /** 买家名字 */
    private String buyerName;

    /** 买家手机号 */
    private String buyerPhone;

    /** 买家地址 */
    private String buyerAddress;

    /** 买家微信openid */
    private String buyerOpenid;

    /** 订单总金额 */
    private BigDecimal orderAmount;

    /** 订单状态，默认为0新下单 */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** 支付状态 默认为0未支付*/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

}
