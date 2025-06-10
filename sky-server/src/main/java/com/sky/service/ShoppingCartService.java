package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

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

    /**
     * 查看购物车
     */
    List<ShoppingCart> showShoppingCart();

    /**
     * 清空购物车
     */
    void cleanShoppingCart();

    /**
     * 删除购物车中的一个商品
     */
    void sub(ShoppingCartDTO shoppingCartDTO);
}
