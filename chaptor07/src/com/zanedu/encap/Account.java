package com.zanedu.encap;

//1. Account类要求具有属性：姓名（长度为2位3位或4位）、余额（必须>20）、密码（必须是6位） - 如果不满足，则给出提示信息，并给默认值
//2. 通过setXXXX 的方法给Account的属性复制
//3. 在AccountTest中测试

import java.sql.SQLOutput;

public class Account {
    //为了封装，将3个属性全都设置为private
    private String name;
    private double balance;
    private String password;

    //提供两个构造器
    public Account() {

    }

    public Account(String name, double balance, String password) {
//        this.name = name;
//        this.balance = balance;
//        this.password = password;
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //姓名（长度为2位3位或4位）
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("名字要求长度为2位3位或4位， 默认值 无名");
            this.name = "无名";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        //余额（必须>20）
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("要求余额（必须>20）， 默认为0");
//            this.balance = 0;//可以不写，因为原先的默认值就是0
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        //密码（必须是6位）
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码必须是6位，默认密码为 000000");
            this.password = "000000";
        }
    }

    //显示账号信息
    public void showInfo() {
        //可以增加一个权限的校验
        //先判断身份是不是合法的，如果合法就走下来
//        if () {
//            System.out.println("账号信息 name=" + name + "余额=" + "balance");//密码就不显示了
//        } else {
//
//        }
        System.out.println("账号信息 name=" + name + " 余额=" + balance);//密码就不显示了
    }
}



