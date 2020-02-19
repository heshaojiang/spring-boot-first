package com.example.demo.leecode.simple;

import java.util.Scanner;

/**
 * @author hsjiang
 * @version 1.0
 * @Description: TODO
 * @date 2020/2/19/019
 **/
public class Houseboat_1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();//获取号码的数量
        int i = 0;
        while (input.hasNext()) {//获取控制台的输入的号码
            i++;
            double x = input.nextDouble();
            double y = input.nextDouble();
            int result = (int) Math.ceil(Math.PI * (x * x + y * y) / 50 / 2);
            System.out.println("Property "+i+": This property will begin eroding in year "+result+".");
            if (i==amount){
                System.out.println("END OF OUTPUT.");
                break;
            }
        }
    }
}
