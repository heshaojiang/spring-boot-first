package com.example.demo.leecode.simple;

import java.util.Scanner;

/**
 * @author hsjiang
 * @version 1.0
 * @Description: TODO
 * @date 2020/2/19/019
 **/
public class Hangover_1003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            String data = input.next();
            if(data.equals("0.00")){
                return;
            }
            double inputDigit = Double.parseDouble(data);
            double sum = 0.0;
            int i=1;
            for(; ;i++){
                sum += (1.0/(i+1));
                if(sum >= inputDigit){
                    break;
                }
            }
            System.out.println(i+" card(s)");
        }
    }
}
