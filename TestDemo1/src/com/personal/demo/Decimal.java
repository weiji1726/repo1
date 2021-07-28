package com.personal.demo;

/**
 * @Author Wisdom
 * @Date 2021/6/13
 */
public class Decimal{
    public static void main(String[] args){
        double data = 3.02;
        //利用字符串格式化的方式实现四舍五入,保留2位小数
        //1代表小数点后面的位数, 不足补0。f代表数据是浮点类型。保留2位小数就是“%.2f”。
        //String result = String.format("%.2d",data);
        String result = String.format("%.5f",data);
        System.out.println(result);//输出3.0
    }
}
