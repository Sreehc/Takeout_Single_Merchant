package com.sky.service;

import com.sky.vo.OrderReportVO;
import com.sky.vo.SalesTop10ReportVO;
import com.sky.vo.TurnoverReportVO;
import com.sky.vo.UserReportVO;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;

/**
 * @Author: cheers
 * @Date: 2025/6/11 13:18
 * @Description:
 */
public interface ReportService {

    /**
     * 营业额统计
     */
    TurnoverReportVO turnoverStatistics(LocalDate begin, LocalDate end);

    /**
     * 用户统计
     */
    UserReportVO userStatistics(LocalDate begin, LocalDate end);

    /**
     * 订单统计
     */
    OrderReportVO ordersStatistics(LocalDate begin, LocalDate end);

    /**
     * 销量排名
     */
    SalesTop10ReportVO top10Statistics(LocalDate begin, LocalDate end);

    /**
     * 导出数据
     */
    void exportBusinessData(HttpServletResponse response);
}
