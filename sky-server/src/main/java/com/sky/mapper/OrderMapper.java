package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.OrdersCancelDTO;
import com.sky.dto.OrdersConfirmDTO;
import com.sky.dto.OrdersPageQueryDTO;
import com.sky.dto.OrdersRejectionDTO;
import com.sky.entity.Orders;
import com.sky.vo.OrderStatisticsVO;
import com.sky.vo.OrderVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.time.LocalDateTime;

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

    /**
     * 根据订单号查询订单
     */
    @Select("select * from orders where number = #{orderNumber}")
    Orders getByNumber(String orderNumber);

    /**
     * 修改订单信息
     */
    void update(Orders orders);

    /**
     * 用于替换微信支付更新数据库状态的问题
     *
     * @param orderStatus
     * @param orderPaidStatus
     */
    @Update("update orders set status = #{orderStatus},pay_status = #{orderPaidStatus} ,checkout_time = #{check_out_time} " +
            "where number = #{orderNumber}")
    void updateStatus(Integer orderStatus, Integer orderPaidStatus, LocalDateTime check_out_time, String orderNumber);


    /**
     * 历史订单分页查询
     */
    Page<OrderVO> pageQuery(OrdersPageQueryDTO ordersPageQueryDTO);

    /**
     * 根据id查询订单
     */
    @Select("select * from orders where id = #{id}")
    Orders getById(Long id);


    /**
     * 统计订单数据
     */
    OrderStatisticsVO statistics();

    /**
     * 确认订单
     */
    @Update("update orders set status = #{status} where id = #{id}")
    void confirm(OrdersConfirmDTO ordersConfirmDTO);

    /**
     * 拒单
     */
    @Update("update orders set status = 7,rejection_reason = #{rejectionReason} where id = #{id}")
    void rejection(OrdersRejectionDTO ordersRejectionDTO);

    /**
     * 取消订单
     */
    @Update("update orders set cancel_time = now(),status = 6,cancel_reason = #{cancelReason} where id = #{id}")
    void cancel(OrdersCancelDTO ordersCancelDTO);

    /**
     * 派送订单
     */
    @Update("update orders set status = 4,delivery_time = now() where id = #{id}")
    void delivery(Long id);

    /**
     * 完成订单
     */
    @Update("update orders set status = 5 where id = #{id}")
    void complete(Long id);
}
