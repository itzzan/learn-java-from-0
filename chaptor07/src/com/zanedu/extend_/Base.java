package com.zanedu.extend_;

public class Base extends TopBase{ //父类
    //4个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() { //无参构造器
        System.out.println("Base()...");
    }
    public Base(String name, int age) { //有参构造器
        System.out.println("父类Base(String name, int age)构造器被调用....");
    }
    public Base(String name) {
        System.out.println("父类Base(String name)构造器被调用....");
    }
    //父类提供一个public的方法
    public int getN4() {
        return n4;
    }
    public void test100() {
        System.out.println("test100");
    }
    public void test200() {
        System.out.println("test200");
    }
    void test300() {
        System.out.println("test300");
    }
    private void test400() { //私有的不能直接访问
        System.out.println("test400");
    }
    public void callTest400() {
        test400();
    }
}
