package com.personal.demo;

import java.net.URL;

/**
 * @Author Wisdom
 * @Date 2021/4/22
 */
public class ReplaceTest{
    ReplaceTest(){
        //只要路径，不要文件系统前缀file: ，并且从项目根目录截断
        String path1 = this.getClass().getResource("/").getPath();
        System.out.println(path1);
        String path2 = this.getClass().getResource("").getPath();
        System.out.println(path2);
        URL path3 = this.getClass().getResource("");
        System.out.println(path3);
        URL path4 = this.getClass().getResource("/");
        System.out.println(path4);

    }
    public static void main(String args[]) {
        ReplaceTest fun=new ReplaceTest();
        /*String Str = new String("Runoob");

        System.out.print("返回值 :" );
        String replace1 = Str.replace('o','T');
        System.out.println(replace1);

        System.out.print("返回值 :" );
        String replace2 = Str.replace('u','D');
        System.out.println(replace2);*/

    }
}
