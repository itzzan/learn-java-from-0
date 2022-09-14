package com.zanedu.pkg;

import com.zanedu.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        //在不同包下，可以访问public 修饰的属性或方法
        //但是不能访问 protected、默认、private修饰的属性和方法
        System.out.println(a.n1);
        a.m1();
//        a.m2();//error
//        a.m3();//error
//        a,m4();//error
    }
}
