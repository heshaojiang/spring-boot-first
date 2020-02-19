package com.example.demo.leecode.simple;

import java.util.*;

/**
 * @author hsjiang
 * @version 1.0
 * @Description: TODO
 * @date 2020/2/18/018
 **/
public class 号码转换_1002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map numToCountMap = new HashMap();
        int amount = input.nextInt();//获取号码的数量
        String[] numArr = new String[amount];
        List numList = new ArrayList();
        while(input.hasNext()){//获取控制台的输入的号码
            amount --;
            numArr[amount] = input.next().replaceAll("-|Q|Z","")
                    .replaceAll("[A-C]","2")
                    .replaceAll("[D-F]","3")
                    .replaceAll("[G-I]","4")
                    .replaceAll("[J-L]","5")
                    .replaceAll("[M-O]","6")
                    .replaceAll("[P-S]","7")
                    .replaceAll("[T-V]","8")
                    .replaceAll("[W-Y]","9");//字符替换
            if(amount == 0) break;
        }
        for(int i = numArr.length-1; i>=0; i--){//计算号码的重复次数
            String str = numArr[i];
            if(str.length() != 7) continue;
            Integer count = (Integer)numToCountMap.get(str);
            if(count == null){
                numToCountMap.put(str,1);
            }
            else{
                if(count==1){
                    numList.add(Integer.parseInt(str));
                }
                numToCountMap.put(str,++count);
            }
        }
        if(numList.size()==0){
            System.out.println("No duplicates.");
            return;
        }
        Collections.sort(numList);//对号码进行排序
        for(Object tempNum : numList){//按照格式打印号码
            String tempStr = tempNum.toString();
            System.out.println(tempStr.substring(0,3)+"-"+tempStr.substring(3)+" "+numToCountMap.get(tempStr));
        }
    }
}
