package com.imooc.order.vo;

import lombok.Data;

/**
 * @author bizy
 * @date 2020/5/3 13:52
 */
@Data
public class ResultVO<T> {

    private Integer code;
    private String msg;
    private T data;
}
