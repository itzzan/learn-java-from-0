package com.zanedu.pkg;

import java.util.Arrays;

//注意：
//建议需要使用到哪个类就导入哪个类，不建议使用新的方式导入
//import java.util.Scanner;//表示只会引入java.util包下的Scanner
//import java.util.*;//表示将java.util包下的所有类都引入
public class Import01 {
    public static void main(String[] args) {
        //使用系统提供的 Arrays 完成 数组排序
        int[] arr = {-1, 20, 2, 13, 3};
        //比如对其进行排序
        //传统方法是：自己编写排序（冒泡）
        //系统是提供了相关的类，可以方便的排序 Arrays
        Arrays.sort(arr);
        //输出排序结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
