package com.zanedu.extend_;
//大学生类 -> 模拟大学生的考试的简单情况
public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing() {//和Pupil不一样
        System.out.println("大学生" + name + " 正在考大学数学");
    }
    public void showInfo() {
        System.out.println("学生名 " + name + " 年龄 " + age + " 成绩 " + score);
    }

}
