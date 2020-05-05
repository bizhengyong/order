package com.imooc.order.utils;

import com.imooc.order.vo.ResultVO;

/**
 * @author bizy
 * @date 2020/5/3 13:53
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
