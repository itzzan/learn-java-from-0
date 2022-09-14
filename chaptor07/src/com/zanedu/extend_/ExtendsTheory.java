package com.zanedu.extend_;
/*
讲解继承的本质
 */
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();//内存的布局
        //这时要按照查找关系来返回信息
        //1. 首先看子类是否有该属性
        //2. 如果子类有这个属性，并且可以访问，则返回信息
        //3. 如果子类没有这个属性，就向上（看父类）有没有这个属性，如果有并且可以访问，就返回信息
        //4. 如果父类没有就按照3的规则继续找上一级父类，直到Object，如果都没有，就会报错
        System.out.println(son.name);
        System.out.println(son.age);
        System.out.println(son.hobby);
    }
}

class GrandPa { //爷类
    String name = "大头爷爷";
    String hobby = "旅游";
}
class Father extends GrandPa { //父类
    String name = "大头爸爸";
    int age = 39;
//    private int age = 39;//如果变成私有的，内存当中还是有的，但是不能访问
    //解决方法：用公有的方法来访问到私有的属性
//    public int getAge() {
//        return age;
//    }
}
class Son extends Father { //子类
    String name = "大头儿子";
}