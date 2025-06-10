package com.sky.service;

import com.sky.dto.*;
import com.sky.result.PageResult;
import com.sky.vo.OrderPaymentVO;
import com.sky.vo.OrderStatisticsVO;
import com.sky.vo.OrderSubmitVO;
import com.sky.vo.OrderVO;

/**
 * @Author: cheers
 * @Date: 2025/6/10 14:35
 * @Description:
 */
public interface OrderService {

    /**
     * 用户下单
     */
    OrderSubmitVO submitOrder(OrdersSubmitDTO ordersSubmitDTO);


    /**
     * 订单支付
     */
    OrderPaymentVO payment(OrdersPaymentDTO ordersPaymentDTO) throws Exception;

    /**
     * 支付成功，修改订单状态
     */
    void paySuccess(String outTradeNo);



    /**
     * 历史订单查询
     */
    PageResult pageQuery4User(Integer page, Integer pageSize, Integer status);

    /**
     * 订单详情
     */
    OrderVO getOrderDetail(Long id);


    /**
     * 再来一单
     */
    void repetition(Long id);

    /**
     * 管理端订单查询
     */
    PageResult pageQuery4Admin(OrdersPageQueryDTO ordersPageQueryDTO);

    /**
     * 各个状态的订单数量统计
     */
    OrderStatisticsVO statistics();

    /**
     * 确认订单
     */
    void confirm(OrdersConfirmDTO ordersConfirmDTO);

    /**
     * 订单拒接
     */
    void rejection(OrdersRejectionDTO ordersRejectionDTO);

    /**
     * 管订单取消
     */
    void cancel(OrdersCancelDTO ordersCancelDTO);


    /**
     * 派送订单
     */
    void delivery(Long id);

    /**
     * 完成订单
     */
    void complete(Long id);
}
