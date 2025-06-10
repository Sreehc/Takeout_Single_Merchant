package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: cheers
 * @Date: 2025/6/10 14:37
 * @Description:
 */
@Mapper
public interface OrderDetailMapper {
    /**
     * 批量插入订单明细数据
     * @param orderDetailList
     */
    public void insertBatch(List<OrderDetail> orderDetailList);
}
