package com.sky.service;

import com.sky.dto.ShoppingCartDTO;

/**
 * @Author: cheers
 * @Date: 2025/6/10 13:10
 * @Description:
 */
public interface ShoppingCartService {

    /**
     * 添加购物车
     */
    void add(ShoppingCartDTO shoppingCartDTO);
}
