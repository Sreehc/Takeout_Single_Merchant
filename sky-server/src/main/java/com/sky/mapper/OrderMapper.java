package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: cheers
 * @Date: 2025/6/10 14:37
 * @Description:
 */
@Mapper
public interface OrderMapper {
    /**
     * 新增订单数据
     */
    void insert(Orders order);
}
