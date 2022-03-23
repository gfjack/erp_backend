package com.kdwz.erp.util;

import java.util.Calendar;
import java.util.Date;

import static com.kdwz.erp.constant.Constant.TITLE;

public class OrderUtils {

    /**
     * 订单编号生成器
     * @param date 订单日期
     * @param num 订单日已经有几个订单
     * @return 所生成的订单编号
     */
    public static String generateOrderNum(Date date, Integer num) {
        StringBuilder orderNum = new StringBuilder("");
        orderNum.append(TITLE);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        orderNum.append(c.get(Calendar.YEAR));
        orderNum.append(c.get(Calendar.MONTH) + 1);
        orderNum.append(c.get(Calendar.DAY_OF_MONTH));

        orderNum.append("N");
        orderNum.append(num + 1);

        return orderNum.toString();
    }

}
