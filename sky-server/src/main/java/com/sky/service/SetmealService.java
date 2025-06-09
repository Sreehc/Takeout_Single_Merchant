package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.result.PageResult;
import com.sky.vo.DishItemVO;
import com.sky.vo.SetmealVO;

import java.util.List;

/**
 * @Author: cheers
 * @Date: 2025/6/8 12:39
 * @Description:
 */
public interface SetmealService {

    /**
     * 新增套餐
     */
    void saveWithDish(SetmealDTO setmealDTO);

    /**
     * 套餐分页查询
     */
    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    /**
     * 删除套餐
     */
    void deleteBatch(Long[] ids);

    /**
     * 修改套餐
     */
    void update(SetmealDTO setmealDTO);

    /**
     * 根据id查询套餐
     */
    SetmealVO getByIdWithDish(Long id);

    /**
     * 套餐起售停售
     */
    void startOrStop(Integer status, Long id);

    /**
     * 条件查询
     */
    List<Setmeal> list(Setmeal setmeal);

    /**
     * 根据id查询菜品选项
     */
    List<DishItemVO> getDishItemById(Long id);
}
