package com.example.demo.leecode.simple;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author hsjiang
 * @version 1.0
 * @Description: TODO
 * @date 2020/2/19/019
 **/
public class Financial_1004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount = 12;
        BigDecimal sum = new BigDecimal(0.0);
        while (input.hasNext()) {//获取控制台的输入的号码
            sum = sum.add(input.nextBigDecimal());
            amount--;
            if (amount == 0) break;
        }
        double result = sum.divide(new BigDecimal(12),2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println("$"+result);
    }
}
