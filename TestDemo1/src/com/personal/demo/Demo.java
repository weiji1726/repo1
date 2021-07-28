package com.personal.demo;

public class Demo{
    public void method0(){
        System.out.println("HelloWorld0");
    }
    public static void method1(){
        System.out.println("HelloWorld1");
    }
    public static void main(String args[]){
        new Demo().method0();//利用其引用变量调用它的非静态方法
        method1();//静态方法可以直接调用
    }
}


333333333333333333333333333333333333333333333333333
555555555555555555555555555
77777777777777777777777777777777777777
