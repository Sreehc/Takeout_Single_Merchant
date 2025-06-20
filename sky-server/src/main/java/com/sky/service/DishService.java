package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

/**
 * @Author: cheers
 * @Date: 2025/6/7 15:22
 * @Description:
 */
public interface DishService {

    /**
     * 新增菜品和对应的口味
     */
    void saveWithFlavor(DishDTO dishDTO);

    /**
     * 菜品分页查询
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 根据id查询菜品
     */
    void deleteBatch(List<Long> ids);

    /**
     * 根据id查询菜品
     */
    DishVO getByIdWithFlavor(Long id);

    /**
     * 修改菜品
     */
    void updateWithFlavor(DishDTO dishDTO);

    /**
     * 启用禁用菜品
     */
    void startOrStop(Integer status, Long id);

    /**
     * 根据分类id查询菜品选项
     */
    List<Dish> list(Long categoryId);

    /**
     * 条件查询菜品和口味
     */
    List<DishVO> listWithFlavor(Dish dish);
}
