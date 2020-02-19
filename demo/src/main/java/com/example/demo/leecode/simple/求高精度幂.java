package com.example.demo.leecode.simple;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author hsjiang
 * @version 1.0
 * @Description: TODO
 * @date 2020/2/18/018
 **/
public class 求高精度幂 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()) {
            BigDecimal  data = s.nextBigDecimal();
            int num = s.nextInt();
            String result = data.pow(num).stripTrailingZeros().toPlainString();
            if(result.charAt(0) == '0'){
                result = result.substring(1);
            }
            System.out.println(result);
        }
    }
}
